package com.company.repository.impl;


import com.company.models.User;
import com.company.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component(value = "usersRepository")
public class UsersRepositoryImpl implements UsersRepository {

    //language=SQL
   private static final String SQL_FIND_ALL_USERS = "SELECT * FROM users";

   //language=SQL
   private static final String SQL_FIND_USER_BY_ID = "SELECT * FROM users WHERE id = ?";

   //language=SQL
   private static final String SQL_FIND_USER_BY_EMAIL = "SELECT * FROM users WHERE email = ?";

   //language=SQL
   private static final String SQL_FIND_USER_BY_NAME = "SELECT * FROM users WHERE name = ?";

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private JdbcTemplate template;

    @Override
    public  List<User> findByName(String name) {
        return template.query(SQL_FIND_USER_BY_NAME, (row, rowNumber) -> User.builder()
                .id(row.getLong("id"))
                .name(row.getString("name"))
                .email(row.getString("email"))
                .password(row.getString("password"))
                .build());
    }

    @Override
    public  List<User> findByEmail(String email) {
        return template.query(SQL_FIND_USER_BY_EMAIL, (row, rowNumber) -> User.builder()
                .id(row.getLong("id"))
                .name(row.getString("name"))
                .email(row.getString("email"))
                .password(row.getString("password"))
                .build());
    }

    @Override
    public List<User> findAll() {
        return template.query(SQL_FIND_ALL_USERS,(row, rowNumber) -> User.builder()
                .id(row.getLong("id"))
                .name(row.getString("name"))
                .email(row.getString("email"))
                .password(row.getString("password"))
                .build());
    }



    @Transactional
    public void save(User model) {
        entityManager.persist(model);
    }

    @Override
    public User find(Long id) {
        return template.queryForObject(SQL_FIND_USER_BY_ID,(row, rowNumber) -> User.builder()
                .id(row.getLong("id"))
                .name(row.getString("name"))
                .email(row.getString("email"))
                .password(row.getString("password"))
                .build());
    }


    @Transactional
    public void update(User model) {
        if (find(model.getId()) != null) {
            entityManager.merge(model);
        }

    }

    @Transactional
    public void delete(Long id) {
        if (find(id) != null) {
            User model = find(id);
            entityManager.remove(model);
        }
    }
}