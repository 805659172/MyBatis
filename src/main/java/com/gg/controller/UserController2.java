package com.gg.controller;

import com.gg.entity.User;
import com.gg.factory.BeanFactory;
import com.gg.service.UserService;
import com.gg.service.UserService2;

public class UserController2 {
    private UserService2 userService = BeanFactory.getBean("userService2");

    public void findByID(){
        int id = 1;
        User user = userService.findByID(id);
        System.out.println(user);
    }
}
