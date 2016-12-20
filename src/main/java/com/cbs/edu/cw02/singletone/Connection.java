package com.cbs.edu.cw02.singletone;

public class Connection {

    private static Connection connection;

    private Connection() {
    }

    public static Connection getInstance() {
        if (connection != null) connection = new Connection();
        return connection;
    }
}
