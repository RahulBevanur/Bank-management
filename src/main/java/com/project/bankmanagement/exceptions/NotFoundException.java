package com.project.bankmanagement.exceptions;

public class NotFoundException extends RuntimeException {
    NotFoundException(String error) {
        super(error);
    }

}
