package com.andrew.creditcard.input;

import com.andrew.creditcard.domain.CreditCardTransaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Function;

public abstract class CreditCardTransactionsReader<T> implements TransactionReader<List<CreditCardTransaction>, T> {
    private static final int CARD_NUMBER = 0;
    private static final int TIMESTAMP = 1;
    private static final int AMOUNT = 2;
    private static String COMMA = ",";

    protected Function<String, CreditCardTransaction> mapToTransaction = (line) -> {
        //eg. 10d7ce2f43e35fa57d1bbf8b1e2, 2014-04-29T13:15:54, 10.00
        String[] items = line.split(COMMA);
        CreditCardTransaction transaction = new CreditCardTransaction(
                items[CARD_NUMBER].trim(),
                LocalDateTime.parse(items[TIMESTAMP].trim()),
                new BigDecimal(items[AMOUNT].trim())
        );
        return transaction;
    };
}

