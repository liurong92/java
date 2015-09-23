package com.liurong.service;

import com.liurong.dao.OrderDao;
import com.liurong.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    public void addOrder(Order order){
        orderDao.addOrder(order);
    }

    public List findOrderByUserId(int userId) {
        return orderDao.findOrderByUserId(userId);
    }

    public void deleteOrder(int orderId) {
        orderDao.deleteOrder(orderId);
    }
}
