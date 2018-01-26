package com.company.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users_profile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class UsersProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String organization;
    private String phonenumber;
    private Long usersId;

}
