package com.company.services;

import com.company.forms.BuyProductForm;
import com.company.models.Bucket;
import com.company.models.User;
import com.company.repositories.BucketRepository;
import com.company.repositories.ProductsRepository;
import com.company.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BucketServiceImpl implements BucketService {

    @Autowired
    private BucketRepository bucketRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public boolean hasUserBuckets(User user) {
        Optional<List<Bucket>> optional = bucketRepository.findByUserId(user.getId());
        if (optional.isPresent()){
            return true;
        }
        return false;
    }

    @Override
    public void save(BuyProductForm form) {
        Bucket bucket = bucketRepository.findByUserIdAndProductId(form.getUserId(), form.getProductId());
        if (bucket != null){
            bucket.setAmount(bucket.getAmount() + form.getAmount());
            bucketRepository.save(bucket);
        } else {
            bucketRepository.save(Bucket.builder()
            .user(usersRepository.findOne(form.getUserId()))
            .product(productsRepository.findOne(form.getProductId()))
            .amount(form.getAmount())
            .build());
        }


    }

    @Override
    public Bucket findByUserIdAndProductId(Long userId, Long productId) {
        return bucketRepository.findByUserIdAndProductId(userId, productId);
    }

    @Override
    public void delete(Long bucketId) {
        bucketRepository.delete(bucketId);
    }
}
