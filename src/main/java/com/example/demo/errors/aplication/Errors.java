package com.example.demo.errors.aplication;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.errors.domain.ErrorConstants;
import com.example.demo.errors.domain.ReturningError;

@Service
public class Errors {
    Map<String, HttpStatus> errorMap = new HashMap<String, HttpStatus>();

    public Errors() {
        this.setErrors();
    }

    private void setErrors() {
        errorMap.put("UNKNOWN", HttpStatus.INTERNAL_SERVER_ERROR);
        errorMap.put(ErrorConstants.USER_NOT_FOUND.name(), HttpStatus.BAD_REQUEST);
        errorMap.put(ErrorConstants.EMAIL_EXIST.name(), HttpStatus.CONFLICT);
    }

    public HttpStatus getCodeError(String key) {
        return errorMap.containsKey((key)) ? errorMap.get((key))
                : HttpStatus.INTERNAL_SERVER_ERROR;
    }

    public ReturningError getError(String key, String message) {
        HttpStatus statusCode = this.getCodeError(key);
        return ReturningError.builder().code(key).message(message).status(statusCode.value()).build();
    }

}
