package org.cursor;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.cursor.JDBCConstants.*;

public class ServiceCountUsers {
    public void count(String q) {
        try (var connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD); Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery(q);
            resultSet.next();
            int count = resultSet.getInt("count");
            System.out.println(count);

        } catch (
                SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public ServiceCountUsers() {
    }
}
