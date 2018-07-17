package com.wnf.springbootmybatisdemo01.mapper;

import com.wnf.springbootmybatisdemo01.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    public List<User> findAll();
    public int addUser(User user);

    int updateUserById(User user);

    int deleteUserById(Integer integer);

    User findUserById(int id);

    User findUserByName(String name);
}
