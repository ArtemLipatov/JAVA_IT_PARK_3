package com.company.services;

import com.company.forms.ProfileForm;
import com.company.models.User;
import com.company.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;


    @Override
    public User getUser(Long userId) {
        return usersRepository.findOne(userId);
    }

    @Override
    public void update(ProfileForm form) {
        User user = usersRepository.findOne(form.getUserId());
        form.update(user);
        usersRepository.save(user);
    }
}
