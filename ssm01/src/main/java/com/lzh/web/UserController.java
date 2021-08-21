package com.lzh.web;

import com.lzh.entity.Page;
import com.lzh.entity.User;
import com.lzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    //mvc工厂是子工厂，spring工厂是mvc的父类工厂，所以可以跨工厂注入
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
    @GetMapping("/users")
    public String queryUsers(Model model, Page page){
        System.out.println("queryUsers");
        List<User> users=userService.queryUsers();
        model.addAttribute("users",users);
        return "usersPro";
    }

    @RequestMapping("/users/{id}")
    public String queryOne(@PathVariable Integer id){
        System.out.println("query user id:"+id);
        return "index";
    }
    @PostMapping("/users")
    public String updateUser(User user){
        System.out.println("update User:"+user);
        return "index";
    }
}

