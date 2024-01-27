package com.example.demo.errors.domain;

public enum ErrorConstants {
    USER_NOT_FOUND(""),
    EMAIL_EXIST("asdas");

    String reasonPhrase;

    ErrorConstants(String reasonPhrase) {

        this.reasonPhrase = reasonPhrase;
    }

    String getName() {
        return name();
    }
}
