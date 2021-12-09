package com.service;

import com.model.User;
import com.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository userRepository;

    @Override
    public User findUserByName(String name) {
        return userRepository.findUserByName(name);
    }
}
