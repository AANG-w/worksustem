package com.javaee.work.po;

public class User {
    private Integer id;
    private String username;
    private String password;

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; } // 修正变量名

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
}