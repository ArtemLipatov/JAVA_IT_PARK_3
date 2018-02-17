package com.company.controllers;


import com.company.forms.ProfileForm;
import com.company.models.Role;
import com.company.models.User;
import com.company.services.AuthenticationService;
import com.company.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersService service;

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping(value = "/profile")
    public String getProfilePage(@ModelAttribute("model")ModelMap model,
                                 Authentication authentication){
        User user = authenticationService.getUserByAuthentication(authentication);
        if (user.getRole() == Role.ADMIN){
            model.addAttribute("admin", "admin");
        }
        model.addAttribute("user", user);
        return "profile";
    }

    @PostMapping("/profile")
    @ResponseBody
    public ResponseEntity<Object> updateUser(ProfileForm form) {
        service.update(form);
        return ResponseEntity.accepted().build();
    }

//    @GetMapping(value = "/update_profile")
//    public String getUpdateProfilePage(@ModelAttribute("model")ModelMap model,
//                                       Authentication authentication){
//        User user = authenticationService.getUserByAuthentication(authentication);
//        model.addAttribute("user", user);
//        return "profile";
//    }
}
