package com.company.services;

import com.company.forms.NamesForm;
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
    public List<User> getUsers(String orderBy) {
        switch (orderBy) {
            case "registration_date": return usersRepository.findByOrderByRegistrationTime();
            case "desc_registration_date": return usersRepository.findByOrderByRegistrationTimeDesc();
            case "id": return usersRepository.findByOrderById();
            case "desc_id": return usersRepository.findByOrderByIdDesc();
            case "name": return usersRepository.findByOrderByName();
        }
        return usersRepository.findAll();
    }
    @Override
    public User getUser(Long userId) {
        return usersRepository.findOne(userId);
    }

    @Override
    public void update(Long userId, NamesForm form) {
        User user = usersRepository.findOne(userId);
        form.update(user);
        usersRepository.save(user);
    }
}
