package com.wnf.springbootmybatisdemo01.service.impl;

import com.wnf.springbootmybatisdemo01.mapper.UserDao;
import com.wnf.springbootmybatisdemo01.entity.User;
import com.wnf.springbootmybatisdemo01.service.UserService;
import com.wnf.springbootmybatisdemo01.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        List<User> list = userDao.findAll();
        return list;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int updateUserById(User user) {
        return userDao.updateUserById(user);
    }

    @Override
    public int deleteUserById(int integer) {
        return userDao.deleteUserById(integer);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }
}
