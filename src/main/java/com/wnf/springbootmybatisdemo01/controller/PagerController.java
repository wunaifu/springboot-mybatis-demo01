package com.wnf.springbootmybatisdemo01.controller;

import com.wnf.springbootmybatisdemo01.entity.User;
import com.wnf.springbootmybatisdemo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PagerController {

    @Autowired
    UserService userService;

    @RequestMapping("/index")
    public String index(Model model) {
        List<User> userList = userService.findAllUser();
        model.addAttribute("list", userList);
        return "index";
    }
}
