package com.project.bankmanagement.exceptions;

public class InvalidTransactionException extends RuntimeException {
    InvalidTransactionException(String error) {
        super(error);
    }
}
