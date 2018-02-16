package com.company.services;

import com.company.forms.ProductForm;
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
    public void addProduct(ProductForm form){
        Product newProduct = Product.builder()
                .category(form.getCategory())
                .model(form.getModel())
                .color(form.getColor())
                .productCode(form.getProductCode())
                .price(form.getPrice())
                .description(form.getDescription())
                .imagePath(form.getImagePath())
                .build();

        productsRepository.save(newProduct);
    }


    @Override
    public List<Product> getProducts(String orderBy) {
        switch (orderBy) {
            case "id" : return productsRepository.findByOrderById();
            case "id_ats" : return productsRepository.findByCategoryOrderById("АТС");
            case "id_sks" : return productsRepository.findByCategoryOrderById("СКС");
            case "id_rec" : return productsRepository.findByCategoryOrderById("Запись разговоров");
            case "id_video" : return productsRepository.findByCategoryOrderById("Видеонаблюдение");

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
