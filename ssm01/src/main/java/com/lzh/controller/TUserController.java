package com.lzh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TUserController {

//    @RequestMapping(value = "regist",method = RequestMethod.GET)
//    public String regsit(String mail,String password){
//        System.out.println(mail);
//        System.out.println(password);
//        return "regist success!";
//    }


    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(String name,String password){
        System.out.println("name: "+name+",password:"+password);
        if("xiaoming".equals(name)&&"123456".equals(password)){
            return "success";
        }
        return "error";
    }


}
