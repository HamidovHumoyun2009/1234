package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private String URL = "jdbc:postgresql://localhost:5432";
    private String DB_NAME = "a23";
    private String USER = "postgres";
    private String PASSWORD = "root";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL + "/" + DB_NAME, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
