package com.lzh.service;

import com.github.pagehelper.PageHelper;
import com.lzh.dao.UserDao;
import com.lzh.entity.Page;
import com.lzh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service  //userServiceImpl
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<User> queryUsers() {
        PageHelper.startPage(100,3);
        return userDao.queryUsers();
    }

    @Override
    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }

    @Override
    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public Integer insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public Integer deleteUser(Integer id) {
        return userDao.deleteUser(id);
    }

    @Override
    public Integer insertManyUsers(List<User> users) {
        return userDao.insertManyUsers(users);
    }

    @Override
    public Integer deleteManyUsers(List<Integer> ids) {
        return userDao.deleteManyUsers(ids);
    }
}
