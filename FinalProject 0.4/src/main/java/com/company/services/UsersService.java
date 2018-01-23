package com.company.services;

import com.company.models.User;

import java.util.List;

public interface UsersService {
    List<User> getUsers(String orderBy);
}
