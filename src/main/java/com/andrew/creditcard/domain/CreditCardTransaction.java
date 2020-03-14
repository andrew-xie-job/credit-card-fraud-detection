package com.andrew.creditcard.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreditCardTransaction {
    private final String cardNumber;
    private final LocalDateTime timestamp;
    private final BigDecimal amount;

    public CreditCardTransaction(String cardNumber, LocalDateTime timestamp, BigDecimal amount) {
        this.cardNumber = cardNumber;
        this.timestamp = timestamp;
        this.amount = amount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
