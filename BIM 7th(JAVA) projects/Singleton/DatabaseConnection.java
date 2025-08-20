package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    
    private static DatabaseConnection instance;

    
    private DatabaseConnection() {
        // Initialize the database connection in the constructor
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Replace the placeholders with your actual database connection details
            String url = "jdbc:mysql://localhost:3306/bim7b";
            String user = "root";
            String password = "";

            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
    }

    // Public method to provide access to the single instance of the class
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Private instance variable to hold the database connection
    private Connection connection;

    // Public method to get the database connection
    public Connection getConnection() {
        return connection;
    }

    // Other methods for database operations can be added as needed
    // Example of closing the connection when the application exits
    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions appropriately
        }
    }

    public class Main {

        public static void main(String[] args) {
            // Get the instance of the DatabaseConnection
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();

            // Access the database connection
            Connection connection = dbConnection.getConnection();

            // Now you can use the 'connection' object to execute queries, fetch results, etc.
            // Close the connection when the application exits or when it's no longer needed
            dbConnection.closeConnection();
        }
    }

}
