package com.company.services;

import com.company.models.Bucket;
import com.company.models.OrderStatus;
import com.company.models.Ordered;
import com.company.models.User;
import com.company.repositories.BucketRepository;
import com.company.repositories.OrderedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderedServiceImpl implements OrderedService {

    @Autowired
    private BucketRepository bucketRepository;

    @Autowired
    private OrderedRepository orderedRepository;

    @Override
    public Double sumAllProducts(User user) {
        List<Bucket> buckets = bucketRepository.findByUserId(user.getId()).get();
        Double sum = 0.0;
        for (Bucket b : buckets){
            sum = sum + (b.getProduct().getPrice()*b.getAmount());
        }
        return sum;
    }

    @Override
    public void payAllProducts(User user) {
        List<Bucket> buckets = bucketRepository.findByUserId(user.getId()).get();
        for (Bucket b : buckets){
            Ordered ordered = Ordered.builder()
                    .user(b.getUser())
                    .product(b.getProduct())
                    .amount(b.getAmount())
                    .status(OrderStatus.PROCESS)
                    .build();
            orderedRepository.save(ordered);
            bucketRepository.delete(b);
        }

    }

    @Override
    public boolean hasUserOrdered(User user) {
        Optional<List<Ordered>> optional = orderedRepository.findByUserId(user.getId());
        if (optional.isPresent()){
            return true;
        }
        return false;
    }
}
