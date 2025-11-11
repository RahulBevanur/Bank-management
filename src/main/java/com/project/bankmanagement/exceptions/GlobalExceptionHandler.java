package com.project.bankmanagement.exceptions;

import com.project.bankmanagement.res.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    //Unknown exception handler
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<?>> handleAllUnknownEception(Exception ex){
        Response<?> response =  Response.builder()
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    //NotFoundException
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Response<?>> handleNotFoundException(NotFoundException ex){
        Response<?> response =  Response.builder()
                .statusCode(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    //BadRequestException
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Response<?>> handleBadRequestException(BadRequestException ex){
        Response<?> response =  Response.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    //InsufficientBalanceException
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<?>> handleInsufficientBalanceException(InsufficientBalanceException ex){
        Response<?> response =  Response.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    //InvalidTransactionException
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<?>> handleInvalidTransactionException(InvalidTransactionException ex){
        Response<?> response =  Response.builder()
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
