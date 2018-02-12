package com.company.repositories;

import com.company.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findByOrderByRegistrationTime();
    List<User> findByOrderByRegistrationTimeDesc();
    List<User> findByOrderById();
    List<User> findByOrderByIdDesc();
    List<User> findByOrderByName();

    Optional<User> findByConfirmCode(String confirmCode);
    Optional<User> findByEmail(String email);
}
