package com.project.bankmanagement.exceptions;

public class InsufficientBalanceException extends RuntimeException {
    InsufficientBalanceException(String error) {
        super(error);
    }
}
