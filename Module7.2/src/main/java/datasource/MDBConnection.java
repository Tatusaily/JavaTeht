package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MDBConnection {
    private static Connection connection = null;
    public static Connection getConnection() {
        if (connection == null) {
            // Connect to the database
            try {
                connection = DriverManager.getConnection(
                        "jdbc:mariadb://localhost:3306/converterdb?user=appuser&password=password"
                );
            } catch (SQLException e){
                System.out.println("Connection failed");
                e.printStackTrace();}
        }
        return connection;
    }
    public static void terminate() {
        try {
            getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
