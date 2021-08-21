package com.lzh.entity;

import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Boolean gender;
    private Date register_time;

    public User() {
    }

    public User(Integer id, String username, String password, Boolean gender, Date register_time) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.register_time = register_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", register_time=" + register_time +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getRegister_time() {
        return register_time;
    }

    public void setRegister_time(Date register_time) {
        this.register_time = register_time;
    }
}
