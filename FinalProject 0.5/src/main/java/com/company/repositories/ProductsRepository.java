package com.company.repositories;

import com.company.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Long> {

    List<Product> findByOrderById();
    List<Product> findByOrderByIdDesc();
    List<Product> findByOrderByCategory();
    List<Product> findByOrderByModel();
    List<Product> findByOrderByProductCode();
    List<Product> findByOrderByProductCodeDesc();
    List<Product> findByOrderByPrice();
    List<Product> findByOrderByPriceDesc();




}
