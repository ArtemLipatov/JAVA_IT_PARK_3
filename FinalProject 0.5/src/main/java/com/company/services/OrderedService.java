package com.company.services;

import com.company.models.User;

public interface OrderedService {

    Double sumAllProducts(User user);

    void payAllProducts(User user);

    boolean hasUserOrdered(User user);
}
