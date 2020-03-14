package com.andrew.creditcard.input;

import com.andrew.creditcard.domain.CreditCardTransaction;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleTransactionReader extends CreditCardTransactionsReader<List<String>> {

    @Override
    public List<CreditCardTransaction> process(List<String> inputTransactions) {
        return inputTransactions.stream().map(mapToTransaction).collect(Collectors.toList());
    }
}
