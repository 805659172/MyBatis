package com.gg.controller;

import com.gg.entity.User;
import com.gg.service.UserService;

public class UserController {

    private UserService userService;

    public void findByID(){
        int id = 1;
        User user = userService.findByID(id);
        System.out.println(user);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
