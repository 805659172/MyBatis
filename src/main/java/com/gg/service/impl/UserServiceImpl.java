package com.gg.service.impl;

import com.gg.dao.UserDao;
import com.gg.entity.User;
import com.gg.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public User findByID(Integer ID) {
        return userDao.findByID(ID);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
