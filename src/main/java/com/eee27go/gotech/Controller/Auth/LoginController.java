package com.eee27go.gotech.Controller.Auth;

import com.eee27go.gotech.Dao.UserDao;
import com.eee27go.gotech.Entity.UserEntity;
import com.eee27go.gotech.IndexController;
import org.apache.ibatis.binding.MapperMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.xml.stream.events.EndElement;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * By: eee27
 * Date: 2018/8/5 21:31
 *
 * @author eee27
 */

@Controller
public class LoginController {
    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    @Autowired
    private UserDao userDao;
    
    @RequestMapping("/login.do")
    public String login() {
        logger.info("Go Login Page");
        
        return "/Auth/login";
    }
    
    @RequestMapping("/login.ajax")
    @ResponseBody
    public boolean loginSubmit(@RequestBody Map map) {
        logger.info("Try Login");
        
        
        UserEntity entity = new UserEntity();
        
        entity.setPhone(map.get("phoneAndEmail").toString());
        entity.setPassword(map.get("password").toString());
        
        if (userDao.selectCount(entity) > 0) {
            logger.info("Phone Auth");
            return true;
        } else {
            entity.setPhone("");
            entity.setEmail(map.get("phoneAndEmail").toString());
            if (userDao.selectCount(entity) > 0) {
                logger.info("Email Auth");
                return true;
            }
        }
        logger.info("Auth Fail");
        return false;
        
        
    }
    
    
}
