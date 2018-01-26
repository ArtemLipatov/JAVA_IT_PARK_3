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
    @Column(name = "users_id")
    private Long usersId;


  //  private List<Product> productList;

}
