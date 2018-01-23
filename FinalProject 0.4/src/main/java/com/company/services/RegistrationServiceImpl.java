package com.company.services;

import com.company.forms.RegistrationForm;
import com.company.models.User;
import com.company.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private UsersRepository usersRepository;

    private PasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public Long registration(RegistrationForm form) {
        String hashPassword = encoder.encode(form.getPassword());
        LocalDateTime registrationTime = LocalDateTime.now();

        User newUser = User.builder()
                .name(form.getName)
                .email(form.getEmail)
                .hashPassword(hashPassword)
                .registrationTime(registrationTime)
                .build();
        usersRepository.save(newUser);
        return newUser.getId();
    }
}
