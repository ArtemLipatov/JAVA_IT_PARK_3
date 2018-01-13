package com.company.repository;

import com.company.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.sql.DataSource;
import java.util.List;

@Component(value = "productsRepository")
public class ProductsRepositoryEntityManagerImpl implements ProductsRepository {

    private EntityManager entityManager;
    private JdbcTemplate template;

    public ProductsRepositoryEntityManagerImpl(@Qualifier("hikariDataSource") DataSource dataSource) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Product> findByName(String name) {
        TypedQuery query = entityManager
                .createQuery("SELECT product FROM Product product WHERE product.name = :name", Product.class);
        query.setParameter("name", name);
        return query.getResultList();
    }

    @Override
    public List<Product> findByModel(String model) {
        TypedQuery query = entityManager
                .createQuery("SELECT product FROM Product product WHERE product.model = :model", Product.class);
        query.setParameter("model", model);
        return query.getResultList();
    }

    @Override
    public List<Product> findByProductCode(String productCode) {
        TypedQuery query = entityManager
                .createQuery("SELECT product FROM Product product WHERE product.productCode = :productCode", Product.class);
        query.setParameter("productCode", productCode);
        return query.getResultList();
    }

    @Override
    public List<Product> findByRating(int rating) {
        TypedQuery query = entityManager
                .createQuery("SELECT product FROM Product product WHERE product.rating = :rating", Product.class);
        query.setParameter("rating", rating);
        return query.getResultList();
    }

    @Override
    public void save(Product model) {
        entityManager.getTransaction().begin();
        entityManager.persist(model);
        entityManager.getTransaction().commit();
    }


    @Override
    public Product find(Long id) {
        TypedQuery query = entityManager.createQuery("from Product product where product.id = :id", Product.class);
        query.setParameter("id", id);
        return (Product) query.getSingleResult();
    }

    @Override
    public void update(Product model) {
        if (find(model.getId()) != null) {
            entityManager.getTransaction().begin();
            entityManager.merge(model);
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public void delete(Long id) {
        if (find(id) != null) {
            Product model = find(id);
            entityManager.getTransaction().begin();
            entityManager.remove(model);
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public List<Product> findAll() {
        return entityManager
                .createQuery("from Product product order by product.id", Product.class)
                .getResultList();
    }
}
