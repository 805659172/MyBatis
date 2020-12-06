package com.gg.service.impl;

import com.gg.dao.UserDao2;
import com.gg.entity.User;
import com.gg.factory.BeanFactory2;
import com.gg.service.UserService2;

public class UserService2Impl implements UserService2 {

    private UserDao2 userDao = BeanFactory2.getBean("userDao2");

    public User findByID(Integer ID) {
        return userDao.findByID(ID);
    }
}
