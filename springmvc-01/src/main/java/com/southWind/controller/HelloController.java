package com.southWind.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 南风
 * @Date 2021/2/20
 **/

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();

        //业务代码
        String result = "helloSpringMVC";
        mv.addObject("msg",result);

        //视图跳转
        mv.setViewName("hello");

        return mv;
    }
}