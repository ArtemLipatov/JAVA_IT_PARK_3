package com.company.repositories;

import com.company.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();
    List<Product> findAllOrderByName();
    List<Product> findAllOrderById();
    List<Product> findAllOrderByIdDesc();
    List<Product> findAllOrderByPrice();
    List<Product> findAllOrderByPriceDesc();
    List<Product> findAllOrderByProductCode();
    List<Product> findAllOrderByProductCodeDesc();
    List<Product> findAllOrderByRating();
    List<Product> findAllOrderByRatingDesc();
    List<Product> findAllOrderByColor();
    List<Product> findAllOrderByModel();
    List<Product> findAllOrderByModelDesc();

    List<Product> findAllById();
    List<Product> findAllByIdOrderById();
    List<Product> findAllByIdOrderByIdDesc();
    List<Product> findAllByIdOrderByName();
    List<Product> findAllByIdOrderByPrice();
    List<Product> findAllByIdOrderByPriceDesc();
    List<Product> findAllByIdOrderByProductCode();
    List<Product> findAllByIdOrderByProductCodeDesc();
    List<Product> findAllByIdOrderByRating();
    List<Product> findAllByIdOrderByRatingDesc();
    List<Product> findAllByIdOrderByColor();
    List<Product> findAllByIdOrderByModel();
    List<Product> findAllByIdOrderByModelDesc();

    List<Product> findAllByName();
    List<Product> findAllByNameOrderByPrice();
    List<Product> findAllByNameOrderByPriceDesc();
    List<Product> findAllByNameOrderByColor();
    List<Product> findAllByNameOrderByModel();
    List<Product> findAllByNameOrderByModelDesc();
    List<Product> findAllByNameOrderByRating();
    List<Product> findAllByNameOrderByRatingDesc();
    List<Product> findAllByNameOrderByProductCode();
    List<Product> findAllByNameOrderByProductCodeDesc();

    List<Product> findAllByPrice();
    List<Product> findAllByPriceOrderByName();
    List<Product> findAllByPriceOrderByColor();
    List<Product> findAllByPriceOrderByProductCode();
    List<Product> findAllByPriceOrderByProductCodeDesc();
    List<Product> findAllByPriceOrderByRating();
    List<Product> findAllByPriceOrderByRatingDesc();
    List<Product> findAllByPriceOrderByModel();
    List<Product> findAllByPriceOrderByModelDesc();

    List<Product> findAllByRating();
    List<Product> findAllByRatingOrderByName();
    List<Product> findAllByRatingOrderByColor();
    List<Product> findAllByRatingOrderByProductCode();
    List<Product> findAllByRatingOrderByProductCodeDesc();
    List<Product> findAllByRatingOrderByPrice();
    List<Product> findAllByRatingOrderByPriceDesc();
    List<Product> findAllByRatingOrderByModel();
    List<Product> findAllByRatingOrderByModelDesc();

}
