package com.southWind.controller;

import com.alibaba.fastjson.JSONObject;
import com.southWind.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author :southWind
 * @Date 2021/2/22
 **/
@RestController
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody//它就不会走视图解析器，会直接返回一个字符串

    public String json1(){
        //创建一个对象

        User user=new User("南风",18,"男");
        return user.toString();
    }
}
