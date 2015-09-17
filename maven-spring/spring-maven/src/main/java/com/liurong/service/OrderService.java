package com.liurong.service;
import java.sql.*;

import com.liurong.dom.MysqlAccess;
import com.liurong.model.Order;
import java.util.LinkedList;
import java.util.List;

public class OrderService {
//    private List<Order> orderList = new LinkedList<Order>();

    public ResultSet findAll() throws Exception {
        MysqlAccess mysqlAccess = new MysqlAccess();
        System.out.println("---------------orderService---------------");
        return mysqlAccess.readDataBase();
    }

}
