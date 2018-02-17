package com.company.controllers;

import com.company.models.User;
import com.company.services.AuthenticationService;
import com.company.services.OrderedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderedController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private OrderedService orderedService;

    @GetMapping("/pay")
    public String getPayPage(@ModelAttribute("model")ModelMap model,
                             Authentication authentication){
        User user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        Double sum = orderedService.sumAllProducts(user);
        model.addAttribute("sum", sum);
        return "pay";
    }

    @PostMapping("/pay")
    public String payProducts(Authentication authentication){
        User user = authenticationService.getUserByAuthentication(authentication);
        orderedService.payAllProducts(user);
        return "redirect:/bucket";
    }
}
