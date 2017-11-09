package com.company;

import java.sql.*;

public class Show {
    public static void showHumans() throws SQLException {
        Connection connection = Settings.connect();
        Statement statement = connection.createStatement();


        ResultSet resultSet = statement.executeQuery("SELECT * FROM owner ORDER BY id");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("name") + ", возраст: "
                    + resultSet.getInt("age") + ", рост: " + resultSet.getInt("height"));
        }
    }

    public static void showCars() throws SQLException {
        Connection connection = Settings.connect();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM car JOIN owner ON owner_id=car.owner_id ORDER BY car.id; ");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("model") + ", цвет: "
                    + resultSet.getString("color") + ", номер: " + resultSet.getInt("number") +
                    ", владелец: " + resultSet.getInt("owner_id") + " - " + resultSet.getString("name"));
        }


    }

    public static void showOwnersWithoutCars() throws SQLException {
        Connection connection = Settings.connect();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement
                .executeQuery("SELECT * FROM owner LEFT JOIN car ON owner.id = car.owner_id WHERE car.owner_id is null;");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("name") + ", возраст: "
                    + resultSet.getInt("age") + ", рост: " + resultSet.getInt("height"));
        }
    }

    public static void showCarsWithoutOwnrs() throws SQLException {
        Connection connection = Settings.connect();
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.
                executeQuery("SELECT * FROM car LEFT JOIN owner ON owner_id=car.owner_id WHERE car.owner_id is null ; ");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("model") + ", цвет: "
                    + resultSet.getString("color") + ", номер: " + resultSet.getInt("number"));
        }
    }
}

