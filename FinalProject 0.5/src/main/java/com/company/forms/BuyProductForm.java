package com.company.forms;

import lombok.Data;

@Data
public class BuyProductForm {

    private Long userId;
    private Long productId;
    private Integer amount;
}
