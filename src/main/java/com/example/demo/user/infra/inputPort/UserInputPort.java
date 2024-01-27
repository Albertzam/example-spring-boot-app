package com.example.demo.user.infra.inputPort;

import com.example.demo.user.domain.CreateUser;
import com.example.demo.user.domain.DeleteUser;
import com.example.demo.user.domain.User;

public interface UserInputPort {
    public User create(CreateUser args);

    public User update(User args);

    public Integer delete(DeleteUser args);
}
