package com.company;

import com.company.repository.impl.ProductsRepositoryEntityManagerImpl;
import com.company.repository.ProductsRepository;
import com.company.repository.UsersRepository;
import com.company.repository.impl.UsersRepositoryImpl;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


@Component
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("com.company.persistence");



        //непонятная ошибка
        UsersRepository usersRepository =  new UsersRepositoryImpl(/*Вот тут крч нужно что-то делать*/);
        servletContextEvent.getServletContext().setAttribute("usersRepository", usersRepository);

        ProductsRepository productsRepository = new ProductsRepositoryEntityManagerImpl(factory.createEntityManager());
        servletContextEvent.getServletContext().setAttribute("productsRepository", productsRepository);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}