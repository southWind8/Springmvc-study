package com.southWind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ControllerTest2
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/21
 **/
@Controller
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";
    }
}
