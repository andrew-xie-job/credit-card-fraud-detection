package com.andrew.creditcard.detection;

import com.andrew.creditcard.domain.CreditCardTransaction;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class FraudDetection {
    private static Duration TWENTY_FOUR_HOURS = Duration.ofHours(24);

    public List<String> findFraud(List<CreditCardTransaction> transactionList, BigDecimal amountThreshold) {
        List<String> fraudCardList = new ArrayList<>();
        LinkedHashMap<String, List<CreditCardTransaction>> cardTransactionMap = groupTransactionByCardNumber(transactionList);
        cardTransactionMap.forEach(
                (cardNumber, transactions) -> findFraudByCard(transactions, amountThreshold).ifPresent(card -> fraudCardList.add(cardNumber))
        );
        return fraudCardList;
    }


    public Optional<String> findFraudByCard(List<CreditCardTransaction> transactionList, BigDecimal amountThreshold) {
        BigDecimal sum = BigDecimal.ZERO;
        Deque<CreditCardTransaction> checkWindow24hours = new LinkedList<>();
        for (CreditCardTransaction transaction : transactionList) {
            sum = shiftCheckWindow(transaction, sum, checkWindow24hours);
            checkWindow24hours.add(transaction);
            sum = sum.add(transaction.getAmount());
            if (sum.compareTo(amountThreshold) > 0)
                return Optional.of(transaction.getCardNumber());
        }
        return Optional.empty();
    }

    private LinkedHashMap<String, List<CreditCardTransaction>> groupTransactionByCardNumber(List<CreditCardTransaction> transactionList) {
        return transactionList.stream()
                .parallel()
                .collect(
                        groupingBy(CreditCardTransaction::getCardNumber,
                                LinkedHashMap::new,
                                mapping(Function.identity(), toList()))

                );
    }

    private BigDecimal shiftCheckWindow(CreditCardTransaction transaction, BigDecimal sum, Deque<CreditCardTransaction> checkWindow24hours) {
        Duration currentDuration = getDuration(transaction, checkWindow24hours);
        while (currentDuration.compareTo(TWENTY_FOUR_HOURS) > 0) {
            sum = sum.subtract(checkWindow24hours.pollFirst().getAmount());
            currentDuration = getDuration(transaction, checkWindow24hours);
        }
        return sum;
    }

    private Duration getDuration(CreditCardTransaction transaction, Deque<CreditCardTransaction> checkWindow24hours) {
        if (checkWindow24hours.isEmpty())
            return Duration.ZERO;
        return Duration.between(checkWindow24hours.peek().getTimestamp(), transaction.getTimestamp());
    }
}
