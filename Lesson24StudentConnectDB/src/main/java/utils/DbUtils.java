package utils;

import lombok.experimental.UtilityClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@UtilityClass
public class DbUtils {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "root";
    private static final String DB_DRIVER = "org.postgresql.Driver";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            try {
                Class.forName(DB_DRIVER);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Exception " + e.getMessage());
        }
        return connection;
    }

}
