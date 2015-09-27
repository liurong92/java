package com.liurong.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class StudentDao {
    @Autowired private SessionFactory sessionFactory;

    @Transactional
    public List<Student> findAll(){
        Session session = sessionFactory.getCurrentSession();
        List students = session.createQuery("from Student").list();
        return students;
    }
}
