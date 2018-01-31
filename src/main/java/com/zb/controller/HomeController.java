package com.zb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangbin on 2017/12/21.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView home(){
        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        model.addObject("flag","nihao");
        return model;
    }

}