package com.company.forms;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString

public class RegistrationForm {
    private String name;
    private String email;
    private String password;
}
