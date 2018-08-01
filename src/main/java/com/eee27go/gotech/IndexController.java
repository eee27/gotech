package com.eee27go.gotech;

import com.eee27go.gotech.Dao.UserDao;
import com.eee27go.gotech.Entity.UserEntity;
import org.apache.ibatis.binding.MapperMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * By: eee27
 * Date: 2018/6/25 21:31
 */

@RestController
public class IndexController {
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UserDao userDao;

    @RequestMapping("/index")
    public ModelAndView hello(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.html");
        logger.info("WHAT THE FUCK!");


        return mv;
    }


    @RequestMapping("/user")
    @ResponseBody
    public Map user(HttpServletRequest request) {
        HashMap map = new HashMap();

        UserEntity userEntity = userDao.selectByPrimaryKey(1);
        map.put("result", userEntity);


        return map;
    }

}
