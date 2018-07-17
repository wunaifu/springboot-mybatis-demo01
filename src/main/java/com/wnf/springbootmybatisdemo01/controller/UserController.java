package com.wnf.springbootmybatisdemo01.controller;

import com.wnf.springbootmybatisdemo01.entity.User;
import com.wnf.springbootmybatisdemo01.service.UserService;
import com.wnf.springbootmybatisdemo01.util.Pager;
import com.wnf.springbootmybatisdemo01.util.ResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public ResultDto list(){
        List<User> list = userService.findAllUser();
        Pager<User> userPager = new Pager<>(1, 2, list);
        return ResultDto.ok(userPager);
    }

    @RequestMapping("findUser")
    public ResultDto findUser(){
        User user = userService.findUserById(1);
        return ResultDto.ok(user);
    }

    @RequestMapping("addUser")
    public String addUser(){
        User user = new User();
        user.setAddress("中山");
        user.setUsername("wnf");
        user.setBirthday(new Date());
        user.setSex("女");
        if (userService.addUser(user) == 1) {
            return "success";
        }
        return "error";
    }

    @RequestMapping("delUser")
    public int delUser(){
        int result = userService.deleteUserById(1);
        return result;
    }

    @RequestMapping("updateUser")
    public int updateUser(){
        User user = new User();
        user.setId(5);
        user.setUsername("吴乃福");
        int result = userService.updateUserById(user);
        return result;
    }
}
