package com.company;

import java.sql.*;
import java.util.Scanner;

public class Add {
    public static void addHuman() {
        try {
            Connection connection = Settings.connect();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM owner");


            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя владельца");
            String ownerName = scanner.next();
            System.out.println("Введите возраст");
            int age = scanner.nextInt();
            System.out.println("Введите рост");
            int height = scanner.nextInt();


            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO owner(name, age, height) VALUES (?, ?, ?)");
            preparedStatement.setString(1, ownerName);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, height);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }

    }

    public static void addCar() {
        try {

            Connection connection = Settings.connect();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM car");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер");
            int carNumber = scanner.nextInt();
            System.out.println("Введите модель");
            String carModel = scanner.next();
            System.out.println("Введите цвет");
            String carColor = scanner.next();
            System.out.println("Введите номер владельца");
            int ownerId = scanner.nextInt();


            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO car(number, model, color, owner_id) VALUES (?, ?, ?, ?)");
            preparedStatement.setInt(1, carNumber);
            preparedStatement.setString(2, carModel);
            preparedStatement.setString(3, carColor);
            preparedStatement.setInt(4, ownerId);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }

    }
}
