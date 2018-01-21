package com.company.models;


import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "users_profile")
@EqualsAndHashCode

public class UsersProfile {
    private String firstName;
    private String lastName;
    private String organization;
    private String phonenumber;
    private User usersId;


}