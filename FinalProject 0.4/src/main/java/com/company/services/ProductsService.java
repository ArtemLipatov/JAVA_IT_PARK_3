package com.company.services;

import com.company.models.Product;

import java.util.List;

public interface ProductsService {
    List<Product> getProducts(String orderBy);
}
