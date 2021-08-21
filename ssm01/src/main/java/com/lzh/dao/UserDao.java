package com.lzh.dao;

import com.lzh.entity.User;

import java.util.List;

public interface UserDao {
    Integer getTotal();
    List<User> queryUsers();
    User queryUserById(Integer id);
    Integer updateUser(User user);
    Integer insertUser(User user);
    Integer deleteUser(Integer id);

    Integer insertManyUsers(List<User> users);
    Integer deleteManyUsers(List<Integer> ids);
}
