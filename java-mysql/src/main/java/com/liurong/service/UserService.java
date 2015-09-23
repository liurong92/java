package com.liurong.service;

import com.liurong.dao.UserDao;
import com.liurong.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User login(String userName){
        return userDao.login(userName);
    }

    public void addUser(User user){
        userDao.addUser(user);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}
