package com.southWind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/20
 **/
@Controller
public class HelloController {



    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello,SpringMVC");
        return "hello";
        //会被视图解析器处理
    }


}
