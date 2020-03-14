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
        if (args.length != 2) {
            System.err.println("Number of arguments is incorrect. "
                    + "Please provide the path for the input file, the price threshold");
            System.exit(1);
        }

        String inputFilePath = args[0];
        BigDecimal priceThreshHold = new BigDecimal(args[1]);

        TransactionReader<List<CreditCardTransaction>, String> transactionReader = new FileTransactionCsvReader();
        FraudDetection fraudDetection = new FraudDetection();
        List<CreditCardTransaction> transactions = transactionReader.process(inputFilePath);
        List<String> fraudList = fraudDetection.findFraud(transactions, priceThreshHold);
        if (fraudList.isEmpty())
            System.out.println("No Fraud transaction detected.");
        else {
            System.out.println("Detected flowing Fraud Card:");
            fraudList.forEach(System.out::println);
        }
    }

}
