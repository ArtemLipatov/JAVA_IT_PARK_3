package com.company.repository;

import com.company.models.Product;

import java.util.List;

public interface ProductsRepository extends CrudRepository<Product> {
    List<Product> findByName(String name);
    List<Product> findAll();

    List<Product> findByModel(String model);

    List<Product> findByProductCode(String productCode);

    List<Product> findByRating(int rating);


}
