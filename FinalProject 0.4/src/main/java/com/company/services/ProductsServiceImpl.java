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
            case "id" : return productsRepository.findAllOrderById();
            case "desc_id" : return productsRepository.findAllOrderByIdDesc();
            case "name" : return productsRepository.findAllOrderByName();
            case "model" : return productsRepository.findAllOrderByModel();
            case "product_code" : return productsRepository.findAllOrderByProductCode();
            case "desc_product_code" : return productsRepository.findAllOrderByProductCodeDesc();
            case "price" : return productsRepository.findAllOrderByPrice();
            case "desc_price" : return productsRepository.findAllOrderByPriceDesc();
            case "rating" : return productsRepository.findAllOrderByRating();
            case "desc_rating" : return productsRepository.findAllOrderByRatingDesc();
        }
        return productsRepository.findAll();
    }
}
