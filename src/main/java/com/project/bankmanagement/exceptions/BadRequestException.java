package com.project.bankmanagement.exceptions;

public class BadRequestException extends RuntimeException {
    BadRequestException(String error) {
        super(error);
    }
}
