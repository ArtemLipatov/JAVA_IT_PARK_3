package com.company.forms;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QuestionForm {
    private String name;
    private String text;
    private String email;
    private String phonenumber;
}
