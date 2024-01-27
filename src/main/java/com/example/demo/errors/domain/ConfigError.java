package com.example.demo.errors.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.errors.aplication.Errors;

@Configuration
public class ConfigError {

    @Bean
    Errors errors() {
        return new Errors();
    }
}
