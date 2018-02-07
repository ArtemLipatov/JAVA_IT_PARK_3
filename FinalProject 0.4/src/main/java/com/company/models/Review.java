package com.company.models;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "review")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private LocalDateTime reviewDateTime;
    private int rating;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User usersId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_id")
    private Product productId;


}
