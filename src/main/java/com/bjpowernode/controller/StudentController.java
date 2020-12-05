package com.bjpowernode.controller;

import com.bjpowernode.entity.Student;
import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import com.bjpowernode.exception.StudentException;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping("/some.do")
    public ModelAndView doSome(Student student) throws StudentException {
        ModelAndView mv = new ModelAndView();
        if (!"zs".equals(student.getName())){
            throw new NameException("姓名不对哦!!!!");
        }

        if (student.getAge() == null || student.getAge() > 80) {
            throw new AgeException("年龄太大了!!!!");
        }
        String tips = "注册失败";
        int nums = service.addStudent(student);

        if (nums > 0) {
            tips = "注册成功";
        }

        mv.addObject("tips",tips);
        mv.setViewName("show");
        return mv;
    }
}
