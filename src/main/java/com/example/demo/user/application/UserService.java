package com.example.demo.user.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.domain.CreateUser;
import com.example.demo.user.domain.DeleteUser;
import com.example.demo.user.domain.User;
import com.example.demo.user.infra.inputPort.UserInputPort;
import com.example.demo.user.infra.outputPort.UserRepository;

@Service
public class UserService implements UserInputPort {
    @Autowired
    UserRepository userRepository;

    @Override
    public User create(CreateUser args) {
        // TODO Auto-generated method stub
        System.out.println("SI ENTRA PA ALV");
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public User update(User args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Integer delete(DeleteUser args) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
