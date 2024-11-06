/*
 * Copyright (c) 2024
 * **********************************************
 * Jayani Nadeesha
 * **********************************************
 */

package com.auroraskincare.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbc;
    private final Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aurora", "root", "");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if(dbc==null){
            dbc=new DBConnection();
        }
        return dbc;
    }

    public Connection getConnection() {
        return connection;
    }
}
