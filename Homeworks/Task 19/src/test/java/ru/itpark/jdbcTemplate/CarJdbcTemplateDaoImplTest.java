package ru.itpark.jdbcTemplate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.jdbc.template.CarsJdbcTemplateDaoImpl;
import ru.itpark.models.Car;

public class CarJdbcTemplateDaoImplTest {
    private CarsJdbcTemplateDaoImpl testedCarsDao;
    @Before
    public void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        String name = "postgres";
        String password = "1997";
        String url = "jdbc:postgresql://localhost:5432/Lipatov_db";
        testedCarsDao = new CarsJdbcTemplateDaoImpl(dataSource);
    }

    @Test
    public void findCarJdbcTemplate() throws Exception {
        Car expected = Car.builder()
                .id(1)
                .number("123")
                .model("toyota")
                .color("grey")
                .build();
        Car actual = testedCarsDao.find(1);
        Assert.assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void findTestOnBadId(){
        testedCarsDao.find(33);
    }

}