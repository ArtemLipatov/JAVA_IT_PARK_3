package com.company.controllers;

import com.company.models.User;
import com.company.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainPageController {

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/")
    public String getMainPage(Authentication authentication, @ModelAttribute("model")ModelMap model){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "main_page";
    }
}
