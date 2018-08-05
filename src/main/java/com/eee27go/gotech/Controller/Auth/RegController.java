package com.eee27go.gotech.Controller.Auth;

import com.eee27go.gotech.Dao.UserDao;
import com.eee27go.gotech.Entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: eee27
 * @Date: 2018/8/5
 * @Time: 14:12
 */
@Controller
public class RegController {
    private final static Logger logger = LoggerFactory.getLogger(RegController.class);
    
    @Autowired
    private UserDao userDao;
    
    
    @RequestMapping("/reg.do")
    public String reg(HttpServletRequest request) {
        logger.info("Go Reg Page");
        
        request.setAttribute("count", userDao.selectCount());
        
        return "/Auth/reg";
    }
    
    @RequestMapping("/reg.ajax")
    @ResponseBody
    public boolean regSubmit(@RequestBody UserEntity entity) {
        logger.info("Add one");
        
        
        entity.setRoleLevel(0);
        entity.setStatus(0);
        entity.setRegTime(new Date());
        entity.setRegIp("1.1.1.1");
        entity.setDel(0);
        
        
        return userDao.insert(entity) > 0;
    }
    
}
