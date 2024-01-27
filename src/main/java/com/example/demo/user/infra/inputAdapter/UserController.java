package com.example.demo.user.infra.inputAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.errors.domain.CustomError;
import com.example.demo.errors.domain.ErrorConstants;
import com.example.demo.user.domain.CreateUser;
import com.example.demo.user.infra.inputPort.UserInputPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserInputPort userInputPort;

    @GetMapping("")
    public CreateUser getMethodName() {
        throw new CustomError("Email already exist", ErrorConstants.EMAIL_EXIST);
        // return userInputPort.create(args);
    }

}
