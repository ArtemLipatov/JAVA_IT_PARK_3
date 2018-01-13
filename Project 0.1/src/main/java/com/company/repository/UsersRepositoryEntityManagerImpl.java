package com.company.repository;


import com.company.models.User;

import javax.persistence.EntityManager;
import java.util.List;

public class UsersRepositoryEntityManagerImpl implements UsersRepository {
    @Override
    public List<User> findByName(String name) {
        return null;
    }

    @Override
    public List<User> findByEmail(String email) {
        return null;
    }

    private EntityManager entityManager;

    public UsersRepositoryEntityManagerImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> findAll() {
        return entityManager
                .createQuery("from User user order by user.id", User.class)
                .getResultList();
    }

    @Override
    public void save(User model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }

    @Override
    public User find(Long id) {
        return null;
    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Long id) {

    }
}