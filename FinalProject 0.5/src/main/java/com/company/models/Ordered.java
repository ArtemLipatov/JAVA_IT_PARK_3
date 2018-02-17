package com.company.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ordered")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Ordered {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer amount;
    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;
}
