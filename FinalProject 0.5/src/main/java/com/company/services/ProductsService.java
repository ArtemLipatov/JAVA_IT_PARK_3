package com.company.services;

import com.company.forms.ProductForm;
import com.company.models.Product;

import java.util.List;

public interface ProductsService {
    List<Product> getProducts(String orderBy);

    Product getProduct(Long productId);

    String addProduct(ProductForm form);
    void update(Long productId, ProductForm form);
}
