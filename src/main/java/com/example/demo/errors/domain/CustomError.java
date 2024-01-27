package com.example.demo.errors.domain;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class CustomError extends RuntimeException {

    private ErrorConstants code;
    private String message;

    public CustomError(String message, ErrorConstants code) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
