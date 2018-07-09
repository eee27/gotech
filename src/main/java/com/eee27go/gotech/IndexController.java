package com.eee27go.gotech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * By: eee27
 * Date: 2018/6/25 21:31
 */

@Controller
public class IndexController {
    @RequestMapping("/index")
    public ModelAndView hello(HttpServletRequest request) {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("./index.html");
        return mv;
    }

}
