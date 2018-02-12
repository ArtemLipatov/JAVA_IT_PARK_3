package com.company.controllers;


import com.company.forms.ProductForm;
import com.company.models.Product;
import com.company.models.User;
import com.company.services.AuthenticationService;
import com.company.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @Autowired
    AuthenticationService authenticationService;

    @GetMapping(value = "/products")
    public String getProducts(@ModelAttribute("model")ModelMap model,
                              @RequestParam("order_by") String orderBy,
                              Authentication authentication){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        List<Product> products = productsService.getProducts(orderBy);
        model.addAttribute("products", products);
        return "products_page";
    }

    @GetMapping("/products/{product-id}")
    public String getProductPage(@ModelAttribute("model") ModelMap model,
                                 @PathVariable("product-id") Long productId,
                                 Authentication authentication){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
    Product product = productsService.getProduct(productId);
    model.addAttribute("product", product);
    return "product_page";
    }

    @PostMapping("/products/{product-id}")
    @ResponseBody
    public ResponseEntity<Object> updateProduct(@PathVariable("product-id") Long productId,
                                                ProductForm form){
        productsService.update(productId, form);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/all/products/{product-id}")
    @ResponseBody
    public ResponseEntity<Product> getProduct(@ModelAttribute("model") ModelMap model,
                                              @PathVariable("product-id") Long productId,
                                              Authentication authentication){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return ResponseEntity.ok(productsService.getProduct(productId));
    }

    //тут явно ошибка
    @PostMapping("/add_product")
    public String addProduct(@ModelAttribute ProductForm form,
                                   @ModelAttribute("model") ModelMap model) {
        String productCode = productsService.addProduct(form);
        model.addAttribute("productCode", productCode);
        return "products";
    }

    @GetMapping("/add_product")
    public String getAddProductPage(@ModelAttribute("model") ModelMap model,
    Authentication authentication){
        if (authentication != null){
            User user = authenticationService.getUserByAuthentication(authentication);
            model.addAttribute("user", user);
        }
        return "add_product_page";
    }

}
