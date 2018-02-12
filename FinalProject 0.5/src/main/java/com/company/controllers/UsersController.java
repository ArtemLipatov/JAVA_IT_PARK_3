package com.company.controllers;


import com.company.forms.ProfileForm;
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
        model.addAttribute("user", user);
        return "profile";
    }
    @PostMapping("/update_profile")
    @ResponseBody
    public ResponseEntity<Object> updateUser(ProfileForm form,
                                             @RequestParam(value = "id") Long id) {
        service.update(id, form);
        return ResponseEntity.accepted().build();
    }

    @GetMapping(value = "/users")
    public String getUsers(@ModelAttribute("model")ModelMap model,
                           @RequestParam("order_by") String orderBy){
        List<User> users = service.getUsers(orderBy);
        model.addAttribute("users", users);
        return "users_page";
    }

    @GetMapping("/users/{user-id}")
    public String getUserPage(@ModelAttribute("model") ModelMap model,
                              @PathVariable("user-id") Long userId) {
        User user = service.getUser(userId);
        model.addAttribute("user", user);
        return "user";
    }

    @PostMapping("/users/{user-id}")
    @ResponseBody
    public ResponseEntity<Object> updateUser(@PathVariable("user-id") Long userId,
                                             ProfileForm form) {
        service.update(userId, form);
        return ResponseEntity.accepted().build();
    }


}