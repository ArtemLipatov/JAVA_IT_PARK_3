package com.company;

import java.sql.*;

public class Show {
    public static void showHumans() {
        try {


            Connection connection = Settings.connect();
            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery("SELECT * FROM owner ORDER BY id");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("name") + ", возраст: "
                        + resultSet.getInt("age") + ", рост: " + resultSet.getInt("height"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void showAllCars() {
        try {


            Connection connection = Settings.connect();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM car ORDER BY car.id; ");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("model") + ", цвет: "
                        + resultSet.getString("color") + ", номер: " + resultSet.getInt("number"));
            }

        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void showCarsWithOwners() {
        try {


            Connection connection = Settings.connect();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM car JOIN owner ON owner.id=car.owner_id ORDER BY car.id; ");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("model") + ", цвет: "
                        + resultSet.getString("color") + ", номер: " + resultSet.getInt("number") +
                        ", владелец: " + resultSet.getInt("owner_id") + " - " + resultSet.getString("name"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }

    }

    public static void showOwnersWithoutCars() {
        try {


            Connection connection = Settings.connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM owner LEFT JOIN car ON owner.id = car.owner_id WHERE car.owner_id is null;");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("name") + ", возраст: "
                        + resultSet.getInt("age") + ", рост: " + resultSet.getInt("height"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void showCarsWithoutOwnrs() {
        try {


            Connection connection = Settings.connect();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.
                    executeQuery("SELECT * FROM car LEFT JOIN owner ON owner_id=car.owner_id WHERE car.owner_id is null ; ");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("model") + ", цвет: "
                        + resultSet.getString("color") + ", номер: " + resultSet.getInt("number"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

  /*  public static void showWhiteCars() {
        try {
            Connection connection = Settings.connect();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.
                    executeQuery("SELECT * FROM car WHERE color = "White" ; ");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("model") + ", цвет: "
                        + resultSet.getString("color") + ", номер: " + resultSet.getInt("number"));
            }
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }*/
}

