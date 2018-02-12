package com.company.models;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private Category category;

    private String model;
    private String description;
    private String color;

    @Column(name="product_code")
    private String productCode;
    private double price;
    @Column(name = "image_path")
    private String imagePath;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;

}

