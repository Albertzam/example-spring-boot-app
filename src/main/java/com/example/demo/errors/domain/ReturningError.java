package com.example.demo.errors.domain;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ReturningError {
    private String message;
    private Integer status;
    private String code;
}
