package com.company.controllers;

import com.company.models.Product;
import com.company.models.User;
import com.company.services.AuthenticationService;
import com.company.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainPageController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private ProductsService productsService;

    @GetMapping("/")
    public String getMainPage(Authentication authentication, @ModelAttribute("model")ModelMap model){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        List<Product> products = productsService.getProducts("id");
        model.addAttribute("products", products);
        return "main_page";
    }
}
