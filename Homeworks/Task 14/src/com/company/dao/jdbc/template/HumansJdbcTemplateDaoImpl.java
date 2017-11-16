package com.company.dao.jdbc.template;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import com.company.dao.HumansDao;
import com.company.models.Human;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HumansJdbcTemplateDaoImpl implements HumansDao {
    //language=SQL
    private static final String SQL_INSERT_USER = "INSERT INTO owner(age, height, name)" +
            "VALUES (?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_USER_BY_ID = "SELECT * FROM owner WHERE " +
            "id = ?";

    //language=SQL
    private static final String SQL_SELECT_USERS = "SELECT * FROM owner";

    //language=SQL
    private static final String SQL_SELECT_USERS_BY_AGE = "SELECT * FROM owner WHERE age = ?";

    //language=SQL
    private static final String SQL_UPDATE_USER = "UPDATE owner SET age = ?, height = ?, name = ? WHERE id = ?;";

    //language=SQL
    private static final String SQL_CHECK_HAS_CAR = "SELECT car.id FROM car JOIN owner ON owner.id = car.owner_id WHERE car.owner_id = ?;";

    //language=SQL
    private static final String SQL_CHECK_IS_EXIST = "SELECT id FROM owner WHERE id = ?;";

    //language=SQL
    private static final String SQL_DELETE_USER = "DELETE FROM owner WHERE id = ?;";


    private JdbcTemplate template;

    public HumansJdbcTemplateDaoImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    private RowMapper<Human> humanRowMapper = new RowMapper<Human>() {
        @Override
        public Human mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Human(resultSet.getInt("id"),
                    resultSet.getInt("age"),
                    resultSet.getInt("height"),
                    resultSet.getString("name"));
        }
    };


    private RowMapper<Human> humanCheckRowMapper = new RowMapper<Human>() {
        @Override
        public Human mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Human(resultSet.getInt("id"));
        }
    };


    @Override
    public List<Human> findAllByAge(int age) {
        return null;
    }

    @Override
    public void save(Human model) {
        // задача, сохранить model в базу данных
        // и проставить ей сгенерированный бд id-шник

        // создаем объект, который умеет хранить в себе
        // сгенерированные ключи из бд
        KeyHolder keyHolder = new GeneratedKeyHolder();
        // посылаем запрос на создание пользователя
        template.update(
                // передаем PreparedStatement и KeyHolder
                new PreparedStatementCreator() {
                    // передаете ему connection к БД
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        // Непосредственно создаете PreparedStatement
                        // и говорите, что вам нужен будет id в результате
                        PreparedStatement ps =
                                connection.prepareStatement(SQL_INSERT_USER, new String[] {"id"});
                        // задаете параметры запроса
                        ps.setInt(1, model.getAge());
                        ps.setString(2, model.getName());
                        ps.setInt(3, model.getHeight());
                        return ps;
                    }
                }, keyHolder);
        // вытащили сгенерированный id из keyHolder и засунули в модель
        model.setId(keyHolder.getKey().intValue());
    }

    @Override
    public Human find(int id) {
        return template.queryForObject(SQL_SELECT_USER_BY_ID, humanRowMapper, id);
    }

    @Override
    public void update(Human model) {
        if (template.query(SQL_CHECK_IS_EXIST, humanCheckRowMapper, model.getId()).isEmpty()) {
            System.out.println("Владельца с таким id не существует");
        } else {
            template.update(new PreparedStatementCreator() {
                @Override
                public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                    PreparedStatement ps =
                            connection.prepareStatement(SQL_UPDATE_USER);
                    ps.setInt(1, model.getAge());
                    ps.setInt(2, model.getHeight());
                    ps.setString(3, model.getName());
                    ps.setInt(4, model.getId());
                    System.out.println("Пользователь с id " + model.getId() + " изменен.");
                    return ps;
                }
            });
        }
    }

    @Override
    public void delete(int id) {
        if (template.query(SQL_CHECK_IS_EXIST, humanCheckRowMapper, id).isEmpty()) {
            System.out.println("Владельца с таким id не существует");
        } else {
            // проверяем есть ли машина у владельца чтобы избежать ошибки
            if (template.query(SQL_CHECK_HAS_CAR, humanCheckRowMapper, id).isEmpty()) {
                // если нет машины, удаляем
                template.update(new PreparedStatementCreator() {
                    @Override
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps =
                                connection.prepareStatement(SQL_DELETE_USER);
                        ps.setInt(1, id);
                        System.out.println("Владелец с id " + id + " удален.");
                        return ps;
                    }
                });
            } else {
                System.out.println("У этого владельца есть машина и он не может быть удален.");
            }
        }

    }

    @Override
    public List<Human> findAll() {
        return template.query(SQL_SELECT_USERS, humanRowMapper);
    }
}