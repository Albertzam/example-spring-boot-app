package com.example.demo.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends CreateUser {
    private Integer id;

    @Builder(builderMethodName = "childBuilder")
    public User(Integer id, String name, String country) {
        super(name, country);
    }
}
