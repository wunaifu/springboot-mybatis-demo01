package com.wnf.springbootmybatisdemo01.service;

import com.wnf.springbootmybatisdemo01.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUser();

    int addUser(User user);

    int updateUserById(User user);

    int deleteUserById(int integer);

    User findUserById(int id);
}
