package com.company.services;

import com.company.forms.BuyProductForm;
import com.company.models.Bucket;
import com.company.models.User;

public interface BucketService {
    boolean hasUserBuckets(User user);

    void save(BuyProductForm form);

    Bucket findByUserIdAndProductId(Long userId, Long productId);

    void delete(Long bucketId);
}
