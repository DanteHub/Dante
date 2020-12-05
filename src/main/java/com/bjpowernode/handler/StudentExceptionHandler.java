package com.bjpowernode.handler;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","你输入的名字不正确");
        mv.addObject("exception",exception);

        mv.setViewName("error");

        return mv;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception exception){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","年龄过大");
        mv.addObject("ceshi","lalala");
        mv.addObject("exception",exception);
        mv.setViewName("forward:/WEB-INF/jsp/error.jsp");
        return mv;
    }
}
