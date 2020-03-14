package com.andrew.creditcard.detection;

import com.andrew.creditcard.domain.CreditCardTransaction;
import com.andrew.creditcard.input.InputData;
import com.andrew.creditcard.input.SimpleTransactionReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class FraudDetectionTest {
    private static BigDecimal PRICE_THRESHOLD = new BigDecimal(100.00);
    private FraudDetection fraudDetection;
    private SimpleTransactionReader simpleTransactionReader;

    @BeforeEach
    public void setUp() {
        fraudDetection = new FraudDetection();
        simpleTransactionReader = new SimpleTransactionReader();
    }


    @Test
    public void findFraudByCard_withFraudDetected() {
        List<CreditCardTransaction> transactions = simpleTransactionReader.process(InputData.singleCardNumberHasFraudList);
        Optional<String> result = fraudDetection.findFraudByCard(transactions, PRICE_THRESHOLD);
        assertThat(result.isPresent()).isTrue();
    }

    @Test
    public void findFraudByCard_withFraudDetected_multipleWindows() {
        List<CreditCardTransaction> transactions = simpleTransactionReader.process(InputData.singleCardNumberHasFraudList_multipleWindows);
        Optional<String> result = fraudDetection.findFraudByCard(transactions, PRICE_THRESHOLD);
        assertThat(result.isPresent()).isTrue();
    }


    @Test
    public void findFraudByCard_withNoFraudDetected_singleWindow() {
        List<CreditCardTransaction> transactions = simpleTransactionReader.process(InputData.singleCardNumbersNoFraudList);
        Optional<String> result = fraudDetection.findFraudByCard(transactions, PRICE_THRESHOLD);
        assertThat(result.isPresent()).isFalse();
    }

    @Test
    public void findFraudByCard_withNoFraudDetected_multipleWindows() {
        List<CreditCardTransaction> transactions = simpleTransactionReader.process(InputData.singleCardNumbersNoFraudList_multiWindows);
        Optional<String> result = fraudDetection.findFraudByCard(transactions, PRICE_THRESHOLD);
        assertThat(result.isPresent()).isFalse();
    }

    @Test
    void findFraud_noFraudDetected() {
        List<CreditCardTransaction> transactions = simpleTransactionReader.process(InputData.multipleCardNumbersNoFraudList);
        List<String> fraudList = fraudDetection.findFraud(transactions, PRICE_THRESHOLD);
        assertThat(fraudList.isEmpty()).isTrue();
    }

    @Test
    void findFraud_WithFraudDetected() {
        List<CreditCardTransaction> transactions = simpleTransactionReader.process(InputData.multipleCardNumberHaveFraudList);
        List<String> fraudList = fraudDetection.findFraud(transactions, PRICE_THRESHOLD);
        assertThat(fraudList.isEmpty()).isFalse();
    }
}
