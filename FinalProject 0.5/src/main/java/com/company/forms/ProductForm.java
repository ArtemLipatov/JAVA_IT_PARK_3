package com.company.forms;


import com.company.models.Product;
import lombok.Data;

@Data
public class ProductForm {

    private String category;
    private String model;
    private String description;
    private String color;
    private String productCode;
    private int price;
    private String imagePath;


    public void update(Product product){
        product.setCategory(this.category);
        product.setModel(this.model);
        product.setDescription(this.description);
        product.setColor(this.color);
        product.setProductCode(this.productCode);
        product.setPrice(this.price);
        product.setImagePath(this.imagePath);
    }
}
