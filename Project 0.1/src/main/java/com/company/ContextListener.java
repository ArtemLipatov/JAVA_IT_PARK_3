package com.company;

import com.company.repository.ProductsRepositoryEntityManagerImpl;
import com.company.repository.ProductsRepository;
import com.company.repository.UsersRepository;
import com.company.repository.UsersRepositoryEntityManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("com.company.persistence");

        UsersRepository usersRepository = new UsersRepositoryEntityManagerImpl(factory.createEntityManager());
        ProductsRepository productsRepository = new ProductsRepositoryEntityManagerImpl(factory.createEntityManager());

        servletContextEvent.getServletContext().setAttribute("usersRepository", usersRepository);
        servletContextEvent.getServletContext().setAttribute("productsRepository", productsRepository);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}