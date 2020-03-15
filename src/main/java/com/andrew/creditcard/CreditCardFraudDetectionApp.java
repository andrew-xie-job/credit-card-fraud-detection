package com.andrew.creditcard;

import com.andrew.creditcard.detection.FraudDetection;
import com.andrew.creditcard.domain.CreditCardTransaction;
import com.andrew.creditcard.input.FileTransactionCsvReader;
import com.andrew.creditcard.input.TransactionReader;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public class CreditCardFraudDetectionApp {

    public static void main(String[] args) throws IOException {
        checkArgument(args);
        printDetectionResult(detectFraudCard(args));
    }

    private static void printDetectionResult(List<String> fraudList) {
        if (fraudList.isEmpty())
            System.out.println("No Fraud transaction detected.");
        else {
            System.out.println("Detected flowing Fraud Card:");
            fraudList.forEach(System.out::println);
        }
    }

    private static List<String> detectFraudCard(String[] args) throws IOException {
        String inputFilePath = args[0];
        BigDecimal priceThreshHold = new BigDecimal(args[1]);

        TransactionReader<List<CreditCardTransaction>, String> transactionReader = new FileTransactionCsvReader();
        FraudDetection fraudDetection = new FraudDetection();
        List<CreditCardTransaction> transactions = transactionReader.process(inputFilePath);
        return fraudDetection.findFraud(transactions, priceThreshHold);
    }

    private static void checkArgument(String[] args) {
        if (args.length != 2) {
            System.err.println("Number of arguments is incorrect. "
                    + "Please provide the path for the input file, the price threshold");
            System.exit(1);
        }
    }

}
