package ru.itpark.jdbcTemplate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itpark.jdbc.template.HumansJdbcTemplateDaoImpl;
import ru.itpark.models.Human;

public class HumanJdbcTemplateDaoImplTest {
    private HumansJdbcTemplateDaoImpl testedHumansDao;

    @Before
    public void setUp() throws Exception {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        String name = "postgres";
        String password = "1997";
        String url = "jdbc:postgresql://localhost:5432/Lipatov_db";
        testedHumansDao = new HumansJdbcTemplateDaoImpl(dataSource);
    }

    @Test
    public void findHumanJdbcTemplate() throws Exception {
        Human expected = Human.builder()
                .id(1)
                .name("Лейсан")
                .age(23)
                .citizen("Зеленодольск")
                .build();
        Human actual = testedHumansDao.find(1);
        Assert.assertEquals(expected, actual);
    }

    // тест не провален, если снегерировал исключение на
    // плохом id
    @Test(expected = IllegalArgumentException.class)
    public void findTestOnBadUserId() {
        testedHumansDao.find(44);
    }
}