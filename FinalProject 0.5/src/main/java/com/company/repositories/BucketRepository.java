package com.company.repositories;

import com.company.models.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BucketRepository extends JpaRepository<Bucket, Long> {
    Optional<List<Bucket>> findByUserId(Long userId);
    Bucket findByUserIdAndProductId(Long userId, Long productId);
}
