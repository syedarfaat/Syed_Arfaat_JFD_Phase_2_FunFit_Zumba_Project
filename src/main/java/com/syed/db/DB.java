package com.sofi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    // Singleton instance
    private static DB db = new DB();

    private DB() {
        // Driver is automatically loaded by the MySQL JDBC driver in recent versions
        System.out.println("[DB] Driver Loaded (automatically)!!!");
    }

    // Lazy initialization of singleton
    public static DB getDB() {
        return db;
    }

    // Method to get a new connection for each call
    public Connection getConnection() throws SQLException {
    	String url = "jdbc:mysql://localhost:3306/zumba";
        String user = "root";
        String password = "root123";
        return DriverManager.getConnection(url, user, password);
    }
}
