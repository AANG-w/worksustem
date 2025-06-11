package com.javaee.work.service;

import com.javaee.work.po.User;

public interface UserService {
    User selectUserByid(Integer  id);
    void insertUser(User user);
}
