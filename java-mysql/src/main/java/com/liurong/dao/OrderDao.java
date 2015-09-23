package com.liurong.dao;

import com.liurong.model.Order;
import com.liurong.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class OrderDao {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public void addOrder(Order order){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(order);
        transaction.commit();
        session.close();
    }

    public List findOrderByUserId(int userId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Order> orders = session.createQuery("from Order where user_id =" + userId).list();
        transaction.commit();
        session.close();
        return orders;
    }

    public void deleteOrder(int orderId) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("delete from Order where id = :id ");
        query.setLong("id", orderId);
        query.executeUpdate();
        transaction.commit();
        session.close();
    }
}
