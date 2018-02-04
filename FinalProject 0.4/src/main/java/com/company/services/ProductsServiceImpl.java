package com.company.services;

import com.company.models.Product;
import com.company.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Product> getProducts(String orderBy) {
        switch (orderBy) {
            case "id" : return productsRepository.findByOrderById();
            case "desc_id" : return productsRepository.findByOrderByIdDesc();
            case "category" : return productsRepository.findByOrderByCategory();
            case "model" : return productsRepository.findByOrderByModel();
            case "product_code" : return productsRepository.findByOrderByProductCode();
            case "desc_product_code" : return productsRepository.findByOrderByProductCodeDesc();
            case "price" : return productsRepository.findByOrderByPrice();
            case "desc_price" : return productsRepository.findByOrderByPriceDesc();
            case "rating" : return productsRepository.findByOrderByRating();
            case "desc_rating" : return productsRepository.findByOrderByRatingDesc();
        }
        return productsRepository.findAll();
    }
}
