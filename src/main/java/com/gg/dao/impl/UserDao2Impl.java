package com.gg.dao.impl;

import com.gg.dao.UserDao;
import com.gg.dao.UserDao2;
import com.gg.entity.User;

public class UserDao2Impl implements UserDao2 {
    public User findByID(Integer ID) {
        User user = null;
        switch (ID) {
            case 1:
                user = new User(1, "天使の羽2", "北京");
                break;
            case 2:
                user = new User(2, "羽2", "河南");
                break;
            case 3:
                user = new User(3, "GG2", "暗");
                break;
        }
        return user;
    }
}
