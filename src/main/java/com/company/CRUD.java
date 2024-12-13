package com.company;

import java.sql.*;

public class CRUD {

    DBConnection dbConnection = new DBConnection();


    void create(String name, double price, String title, String photo, String category) {
        String sql = "INSERT INTO product(name, price, title, photo, category) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = dbConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setString(3, title);
            preparedStatement.setString(4, photo);
            preparedStatement.setString(5, category);

            int res = preparedStatement.executeUpdate();
            System.out.println(res);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void delete(int id) {
//        String sql = "DELETE FROM Product WHERE id = ?";
//        try (Connection connection = dbConnection.getConnection();//autoClosable
//             PreparedStatement statement = connection.prepareStatement(sql);) {
//            int res = statement.executeUpdate(sql);
//            System.out.println(res);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        String sql = "DELETE FROM product WHERE id = " + id + ";";
        try (Connection connection = dbConnection.getConnection(); // autoClosable
             Statement statement = connection.createStatement()) {
            int res = statement.executeUpdate(sql);
            System.out.println(res);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    void update(String name, double price, int id) {
//        "values" + " ('" + name + "'," + "'" + price + "');";
//        UPDATE table_name SET column1 = value1, column2 = value2 WHERE condition;
        try (Connection connection = dbConnection.getConnection();//autoClosable
             Statement statement = connection.createStatement();) {
            String sql = "UPDATE Product SET name = '" + name
                    + "', price ='" + price + "' " +
                    "WHERE id =" + id + ";";
            int res = statement.executeUpdate(sql);
            System.out.println(res);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    String getEmployees() {
        String sql = "select id, name" +
                " from product";

        try (Connection connection = dbConnection.getConnection();//autoClosable
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql);) {

            StringBuilder builder = new StringBuilder();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                builder.append(id + " | " + name);
                builder.append("\n");
            }
            return builder.toString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
