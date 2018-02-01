package com.company.services;

import com.company.models.User;
import org.springframework.security.core.Authentication;

public interface AuthenticationService {
    User getUserByAuthentication(Authentication authentication);
}
