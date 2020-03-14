package com.andrew.creditcard.input;

import java.io.IOException;

public interface TransactionReader<R, T> {
    R process(T t) throws IOException;
}
