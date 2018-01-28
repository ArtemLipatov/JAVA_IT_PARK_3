package com.company.models;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "owner")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;


    private String hashPassword;

    private LocalDateTime registrationTime;

    private String confirmCode;
    private LocalDateTime expiredDate;

    @Enumerated(value = EnumType.STRING)
    private State state;

}
