package com.company.models;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
@Builder

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String model;
    private String description;
    private String color;
    @Column(name="product_code")
    private String productCode;
    private int rating;
    private int price;
}


