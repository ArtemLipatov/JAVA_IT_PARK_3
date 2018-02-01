package com.company.services;

import com.company.forms.NamesForm;
import com.company.models.User;

import java.util.List;

public interface UsersService {
    List<User> getUsers(String orderBy);

    User getUser(Long userId);

    void update(Long userId, NamesForm form);
}
