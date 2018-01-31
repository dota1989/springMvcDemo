package com.zb.controller;

import com.zb.model.Student;
import com.zb.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangbin on 2018/1/10.
 */
@Controller
public class StudentController {
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("studentDetail")
    public ModelAndView selectById(String id){
        log.info("参数：" + id);
        Student student = studentService.selectByPrimaryKey(Integer.valueOf(id));

        ModelAndView model = new ModelAndView();
        model.setViewName("studentDetail");
        model.addObject("student",student);
        return model;
    }

    @RequestMapping("studentDelete")
    public ModelAndView deleteById(String id){
        int i = studentService.deleteByPrimaryKey(Integer.valueOf(id));

        ModelAndView model = new ModelAndView();
        model.setViewName("studentDetail");
        model.addObject("student",new Student());
        return model;
    }
}
