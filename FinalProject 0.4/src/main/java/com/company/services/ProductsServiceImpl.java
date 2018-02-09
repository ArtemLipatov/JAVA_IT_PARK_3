package com.company.services;

import com.company.forms.ProductForm;
import com.company.models.Category;
import com.company.models.Product;
import com.company.repositories.ProductsRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    @SneakyThrows
    public String addProduct(ProductForm form){
        // Category.valueOf(form.getCategory)
        Product newProduct = Product.builder()
                .category(Category.СКС)
                .model(form.getModel())
                .color(form.getColor())
                .productCode(form.getProductCode())
                .price(form.getPrice())
                .rating(form.getRating())
                .description(form.getDescription())
                .imagePath(form.getImagePath())
                .build();

        productsRepository.save(newProduct);
        return newProduct.getProductCode();
    }


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

    @Override
    public Product getProduct(Long productId) {
        return productsRepository.findOne(productId);
    }

    @Override
    public void update(Long productId, ProductForm form) {
        Product product = productsRepository.findOne(productId);
        form.update(product);
        productsRepository.save(product);
    }
}
