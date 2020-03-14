package com.andrew.creditcard.input;

import com.andrew.creditcard.domain.CreditCardTransaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTransactionReaderTest {
    private static int TOTAL_INPUT_TRANSACTIONS = 31;

    private SimpleTransactionReader simpleTransactionReader;


    @BeforeEach
    public void setUp() {
        simpleTransactionReader = new SimpleTransactionReader();
    }

    @Test
    public void process() {
        List<CreditCardTransaction> transactionList = simpleTransactionReader.process(InputData.multipleCardNumberHaveFraudList);
        assertThat(transactionList.size()).isEqualTo(TOTAL_INPUT_TRANSACTIONS);
    }
}
