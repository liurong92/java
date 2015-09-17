package com.liurong.service;
import java.sql.*;
import com.liurong.model.Order;
import java.util.LinkedList;
import java.util.List;

public class OrderService {
    private List<Order> orderList = new LinkedList<Order>();
    static {
        Connection con = null; //定义一个MYSQL链接对象
        try {
            Class.forName("com.mysql.jdbc.Driver"); //MYSQL驱动
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/threeDB", "root", ""); //链接本地MYSQL
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Statement stmt; //创建声明
        try {
            stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select * from orders");
            int ret_id;
            if (res.next()) {
                ret_id = res.getInt(1);
                System.out.print(ret_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
