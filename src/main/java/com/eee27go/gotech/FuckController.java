package com.eee27go.gotech;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * By: eee27
 * Date: 2018/6/25 21:31
 */

@RestController
public class FuckController {
    @RequestMapping("/start")
    public String hello(HttpServletRequest request) {
        return "Fuck World";
    }

}
