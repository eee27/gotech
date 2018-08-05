package com.eee27go.gotech.Controller.CoreController;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * By: eee27
 * Date: 2018/6/26 20:35
 */

@RestController
@RequestMapping(value = "error")
public class CoreErrorController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "error/error";
    }

    @RequestMapping
    public String error(HttpServletRequest request) {
        getErrorPath();
        return request.getRequestURL().toString();
        /*
        ModelAndView mv=new ModelAndView();
        mv.setViewName("error/404.html");
        return mv;
        */
    }
}
