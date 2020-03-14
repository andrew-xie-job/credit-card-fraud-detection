package com.andrew.creditcard.input;

import com.andrew.creditcard.domain.CreditCardTransaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FileTransactionCsvReaderTest {
    private static int TOTAL_INPUT_TRANSACTIONS = 31;

    private FileTransactionCsvReader fileTransactionCsvReader;
    private String inputFilePath;


    @BeforeEach
    public void setUp() {
        fileTransactionCsvReader = new FileTransactionCsvReader();
        inputFilePath = "src/test/resources/transactions.csv";
    }


    @Test
    void process() {
        List<CreditCardTransaction> transactionList = fileTransactionCsvReader.process(inputFilePath);
        assertThat(transactionList.size()).isEqualTo(TOTAL_INPUT_TRANSACTIONS);
    }
}
