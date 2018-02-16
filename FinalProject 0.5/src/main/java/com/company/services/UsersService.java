package com.company.services;

import com.company.forms.ProfileForm;
import com.company.models.User;

import java.util.List;

public interface UsersService {

    User getUser(Long userId);

    void update(ProfileForm form);
}
