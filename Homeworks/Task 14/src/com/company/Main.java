package com.company;

import com.company.dao.CarDao;
import com.company.dao.HumansDao;
import com.company.dao.jdbc.template.CarDaoJdbcTemplateImpl;
import com.company.dao.jdbc.template.HumansJdbcTemplateDaoImpl;
import com.company.models.Car;
import com.company.models.Human;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Main {

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("postgres");
        dataSource.setPassword("1997");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/Lipatov_db");

        HumansDao humansDao = new HumansJdbcTemplateDaoImpl(dataSource);
        CarDao carDao = new CarDaoJdbcTemplateImpl(dataSource);

        Human avraam = new Human(8, 180, 75, "Авраам");
        Car ford = new Car(8, 333, "Black", "Opel", 5);

//        carDao.save(ford);
//        humansDao.save(avraam);

    }
}
