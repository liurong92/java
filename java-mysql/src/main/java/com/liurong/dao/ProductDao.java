package com.liurong.dao;

import com.liurong.model.Product;
import com.liurong.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class ProductDao {
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    public List getProducts() {
        Session session = sessionFactory.openSession();
        Transaction transactional = session.beginTransaction();
        String hql = "From Product";
        List<Product> products = session.createQuery(hql).list();
        transactional.commit();
        session.close();
        return products;
    }
}
