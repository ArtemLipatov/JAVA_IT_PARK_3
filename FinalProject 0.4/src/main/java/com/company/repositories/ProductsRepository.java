package com.company.repositories;

import com.company.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Long> {

    List<Product> findAllOrderById();
    List<Product> findAllOrderByIdDesc();
    List<Product> findAllOrderByName();
    List<Product> findAllOrderByModel();
    List<Product> findAllOrderByProductCode();
    List<Product> findAllOrderByProductCodeDesc();
    List<Product> findAllOrderByPrice();
    List<Product> findAllOrderByPriceDesc();
    List<Product> findAllOrderByRating();
    List<Product> findAllOrderByRatingDesc();

}
