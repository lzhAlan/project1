package com.lzh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping(value = "regist",method = RequestMethod.GET)
    public String regsit(String mail,String password){
        System.out.println(mail);
        System.out.println(password);
        return "regist success!";
    }
}
