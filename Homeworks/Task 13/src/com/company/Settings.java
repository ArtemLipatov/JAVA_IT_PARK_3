package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Settings {
    public static Connection connect() throws SQLException {
        String name = "postgres";
        String password = "тут тип крч пароль";
        String url = "jdbc:postgresql:" +
                "//localhost:5432/Lipatov_db";
        return DriverManager.getConnection(url, name, password);
    }
}
