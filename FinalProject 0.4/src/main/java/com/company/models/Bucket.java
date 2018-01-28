package com.company.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bucket")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Bucket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User userId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_id")
    private Product productId;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> productList;

}
