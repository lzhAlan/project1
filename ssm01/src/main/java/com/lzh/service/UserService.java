package com.lzh.service;


import com.lzh.entity.Page;
import com.lzh.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> queryUsers();
    User queryUserById(@Param("id") Integer id);
    Integer updateUser(User user);
    Integer insertUser(User user);
    Integer deleteUser(Integer id);

    Integer insertManyUsers(List<User> users);
    Integer deleteManyUsers(List<Integer> ids);
}
