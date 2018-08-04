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
import java.util.List;
import java.util.Map;

/**
 * By: eee27
 * Date: 2018/6/25 21:31
 */

@Controller
public class IndexController {
    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);
    
    @Autowired
    private UserDao userDao;
    
    @RequestMapping("/index.do")
    public String index() {
        logger.info("WHAT THE FUCK!");
        
        return "/index";
    }
    
    @RequestMapping("/user.do")
    public String user() {
        
        return "/user";
    }
    
    
    @RequestMapping("/user.ajax")
    @ResponseBody
    public Map users() {
        HashMap map = new HashMap();
        
        List<UserEntity> users = userDao.selectAll();
        map.put("users", users);
        
        return map;
    }
    
}
