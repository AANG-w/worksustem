package com.javaee.work.controller;

import com.javaee.work.po.Category;
import com.javaee.work.po.User;
import com.javaee.work.service.CategoryService;
import com.javaee.work.service.UserService;
import com.javaee.work.po.User;
import com.javaee.work.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @GetMapping("/to_register")
    public String toRegister() {
        return "register";
    }

    @PostMapping("/userlogin")
    public String userLogin(@RequestParam("id") Integer id, @RequestParam("password") String password) {
        User user = userService.selectUserByid(id);
        if (user == null || !user.getPassword().equals(password))
            return "login";
        else
            return "main";
    }

    @PostMapping("/userregister")
    public String userRegister(User user) {
        userService.insertUser(user);
        return "login";
    }
}