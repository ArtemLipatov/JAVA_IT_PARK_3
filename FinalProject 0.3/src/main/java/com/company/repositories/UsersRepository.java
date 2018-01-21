package com.company.repositories;

import com.company.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<User, Long>{

    List<User> findAll();
    User findByEmail(String email);
    User findByName(String name);
    User findById(Long id);

    void deleteById(Long id);
}
