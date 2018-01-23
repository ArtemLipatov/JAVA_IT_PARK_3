package com.company.repositories;

import com.company.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findByOrderByRegistrationTime();
    List<User> findByOrderByRegistrationTimeDesc();
    List<User> findByOrderById();
    List<User> findByOrderByName();
}
