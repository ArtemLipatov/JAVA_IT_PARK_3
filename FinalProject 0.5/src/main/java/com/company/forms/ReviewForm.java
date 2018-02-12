package com.company.forms;

import lombok.Data;

@Data
public class ReviewForm {

    private Long userId;
    private Long productId;
    private String text;

}
