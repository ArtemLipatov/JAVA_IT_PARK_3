package com.company.services;

import com.company.models.User;
import com.company.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public User getUserByAuthentication(Authentication authentication) {
        String email = authentication.getName();
        return usersRepository.findByEmail(email).get();
    }
}
