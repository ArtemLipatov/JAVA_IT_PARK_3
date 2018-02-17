package com.company.repositories;

import com.company.models.Ordered;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderedRepository extends JpaRepository<Ordered, Long> {
    Optional<List<Ordered>> findByUserId(Long id);
}
