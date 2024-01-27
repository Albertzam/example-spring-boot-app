package com.example.demo.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class CreateUser {
    private String name;
    private String country;
}
