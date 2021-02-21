package com.southWind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ControllerTest3
 * @Description TODO
 * @Author 南方
 * @Date 2021/2/21
 **/
@Controller
@RequestMapping("/c1")
public class ControllerTest3 {
    @RequestMapping("/t3")
    //这样的话访问就是/c1/t3
    public String test1(Model model){
        model.addAttribute("msg","要输出的内容");
        return "test";
    }
}
