package com.liurong.dom;

import java.sql.*;

public class MysqlAccess {
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public ResultSet readDataBase() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/threeDB?" +
                "user=root&password=''");
        statement = connection.createStatement();
        return statement.executeQuery("select * from orders");
    }
}
