package com.andrew.creditcard.input;

import com.andrew.creditcard.domain.CreditCardTransaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FileTransactionCsvReader extends CreditCardTransactionsReader<String> {
    @Override
    public List<CreditCardTransaction> process(String inputFilePath) {
        List<CreditCardTransaction> inputList = new ArrayList<>();
        try {
            Path path = Paths.get(inputFilePath);
            inputList = Files.readAllLines(path).stream().map(mapToTransaction).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputList;
    }

    /*Todo buffered reader for big File
      considering about limited time for excise
      This function will not be implemented
     */
    public void buffedProcess(String inputFilePath) throws IOException {
        Path path = Paths.get(inputFilePath);
        BufferedReader reader = Files.newBufferedReader(path);
        String line = reader.readLine();
    }

}
