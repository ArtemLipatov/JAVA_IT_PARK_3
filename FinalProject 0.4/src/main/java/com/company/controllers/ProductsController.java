package com.company.controllers;


import com.company.models.Product;
import com.company.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping(value = "/products")
    public String getProducts(@ModelAttribute("model")ModelMap model,
                              @RequestParam("order_by") String orderBy){
        List<Product> products = productsService.getProducts(orderBy);
        model.addAttribute("products", products);
        return "products_page";

    }
}
