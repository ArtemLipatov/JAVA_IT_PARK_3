package com.company.forms;

import com.company.models.Product;
import lombok.Data;

@Data
public class ProductForm {

    private String model;
    private String description;
    private String color;
    private String productCode;
    private int rating;
    private int price;
    private String imagePath;


    public void update(Product product){
        product.setModel(this.model);
        product.setDescription(this.description);
        product.setColor(this.color);
        product.setProductCode(this.productCode);
        product.setRating(this.rating);
        product.setPrice(this.price);
        product.setImagePath(this.imagePath);
    }
}
