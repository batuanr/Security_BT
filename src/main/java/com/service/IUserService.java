package com.service;

import com.model.User;

public interface IUserService {
    User findUserByName(String name);
}
