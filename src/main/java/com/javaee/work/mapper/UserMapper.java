package com.javaee.work.mapper;

import com.javaee.work.po.User;

public interface UserMapper {
    User selectUserByid(Integer id);
    void insertUser(User user);
}
