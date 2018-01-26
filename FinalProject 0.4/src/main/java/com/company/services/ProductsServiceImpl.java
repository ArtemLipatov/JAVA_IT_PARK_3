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
            case "id" : productsRepository.findAllOrderById();
            case "desc_id" : productsRepository.findAllOrderByIdDesc();
            case "name" : productsRepository.findAllOrderByName();
            case "model" : productsRepository.findAllOrderByModel();
            case "product_code" : productsRepository.findAllOrderByProductCode();
            case "desc_product_code" : productsRepository.findAllOrderByProductCodeDesc();
            case "price" : productsRepository.findAllOrderByPrice();
            case "desc_price" : productsRepository.findAllOrderByPriceDesc();
            case "rating" : productsRepository.findAllOrderByRating();
            case "desc_rating" : productsRepository.findAllOrderByRatingDesc();
        }
        return productsRepository.findAll();
    }
}
