package com.company.repository;

import com.company.models.User;

import java.util.List;

public interface UsersRepository extends CrudRepository<User> {

    List<User> findByName(String name);

    List<User> findByEmail(String email);

}
