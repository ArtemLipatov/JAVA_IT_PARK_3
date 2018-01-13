package ru.itpark.dao;

import ru.itpark.models.Car;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

public class CarDaoJdbcImpl implements CarsDao {

  private Connection connection;

  public CarDaoJdbcImpl(DataSource dataSource) {
    try {
      connection = dataSource.getConnection();
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
  }


  @Override
  public Car find(int id) {
    try {
      PreparedStatement preparedStatement = connection
          .prepareStatement("SELECT * FROM car WHERE car.id = ?");
      preparedStatement.setInt(1, id);
      ResultSet resultSet = preparedStatement.executeQuery();
      Car car = null;
      while (resultSet.next()) {
        car = Car.builder()
            .id(resultSet.getInt("id"))
            .number(resultSet.getString("number"))
                .model(resultSet.getString("model"))
                .color(resultSet.getString("color"))
            .build();
      }
      if (car == null) {
        throw new IllegalArgumentException("Car with id <" + id + "> not found");
      } else return car;
    } catch (SQLException e) {
      throw new IllegalArgumentException(e);
    }
  }

  @Override
  public List<Car> findAllByColor(String color) {
    return null;
  }

  @Override
  public List<Car> findByOwnerId(int ownerId) {
    return null;
  }

  @Override
  public List<Car> findAllByModel(String model) {
    return null;
  }

  @Override
  public void save(Car model) {

  }

  @Override
  public void update(Car model) {

  }

  @Override
  public void delete(int id) {

  }

  @Override
  public List<Car> findAll() {
    return null;
  }
}