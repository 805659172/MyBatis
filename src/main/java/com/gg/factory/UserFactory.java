package com.gg.factory;

import com.gg.entity.User;

public class UserFactory {
    public static User getUser() {
        return new User();
    }
    public User getUser2() {
        return new User();
    }
}
