package com.company.repository.impl;

import com.company.models.Product;
import com.company.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

//@Component(value = "productsRepository")
public class ProductsRepositoryEntityManagerImpl implements ProductsRepository {

    private EntityManager entityManager;
    private JdbcTemplate template;

    //language=SQL
    private static final String SQL_SELECT_ALL_PRODUCTS = "SELECT * FROM product";

    public ProductsRepositoryEntityManagerImpl(@Qualifier("hikariDataSource") DataSource dataSource) {
        JdbcTemplate template;
    }

    public ProductsRepositoryEntityManagerImpl(EntityManager entityManager) {
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
        //пытался использовать Хикари
/*        return template.query(SQL_SELECT_ALL_PRODUCTS, (row, rowNumber) -> Product.builder()
                .id(row.getLong("id"))
                .name(row.getString("name"))
                .model(row.getString("model"))
                .description(row.getString("description"))
                .color(row.getString("color"))
                .productCode(row.getString("product_code"))
                .rating(row.getInt("rating"))
                .price(row.getInt("price"))
                .build());
*/

        return entityManager
                .createQuery("from Product product order by product.id", Product.class)
                .getResultList();
    }
}
