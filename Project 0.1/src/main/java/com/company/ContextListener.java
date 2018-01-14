package com.company;

import com.company.repository.ProductsRepositoryEntityManagerImpl;
import com.company.repository.ProductsRepository;
import com.company.repository.UsersRepository;
import com.company.repository.UsersRepositoryEntityManagerImpl;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("com.company.persistence");

        EntityManager entityManager = factory.createEntityManager();



        UsersRepository usersRepository = new UsersRepositoryEntityManagerImpl(entityManager);
        servletContextEvent.getServletContext().setAttribute("usersRepository", usersRepository);

        ProductsRepository productsRepository = new ProductsRepositoryEntityManagerImpl(entityManager);
        servletContextEvent.getServletContext().setAttribute("productsRepository", productsRepository);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}