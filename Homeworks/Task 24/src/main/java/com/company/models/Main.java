package com.company.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    // подключили конфигурационный файл
    Configuration configuration = new Configuration()
        .configure("com.company\\hibernate.cfg.xml");
    // получили фабрику сессий
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    // открыли сессию
    Session session = sessionFactory.openSession();
    Query<User> userQuery = session.createQuery("from User user where user.id = 2");

    User user = userQuery.getSingleResult();

    System.out.println(user);

    Query<User> usersQuery = session.createQuery("from User");
    List<User> users = usersQuery.getResultList();
    System.out.println(users);
    session.close();

    session = sessionFactory.openSession();
    // начинаем транзакцию
    session.beginTransaction();
    User newUser = User.builder()
        .name("Артур")
        .citizen("Россия")
        .age(25)
        .build();

    session.persist(newUser);
    session.getTransaction().commit();
    session.close();

    session = sessionFactory.openSession();

    session.beginTransaction();
      newUser.setName("Тимофей");
    session.merge(newUser);
//    session.persist(newUser);
    session.getTransaction().commit();
    session.close();
  }
}