package com.liurong.dao;

import com.liurong.model.User;
import com.liurong.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;


@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class UserDao {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public User login(String userName) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from User where userName= :userName");
        query.setString("userName", userName);
        User user = (User) query.uniqueResult();
        transaction.commit();
        session.close();
        return user;
    }

    public void addUser(User user){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void updateUser(User user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public User findUserById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from User where id = :id");
        query.setInteger("id", id);
        User user = (User) query.uniqueResult();
        transaction.commit();
        session.close();
        return user;
    }
}
