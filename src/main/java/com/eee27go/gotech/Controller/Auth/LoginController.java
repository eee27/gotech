package com.eee27go.gotech.Controller.Auth;

import com.eee27go.gotech.Dao.UserDao;
import com.eee27go.gotech.Entity.UserEntity;
import com.eee27go.gotech.IndexController;
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
 * Date: 2018/8/5 21:31
 * @author eee27
 */

@Controller
public class LoginController {
    private final static Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    
    @RequestMapping("/login.do")
    public String login() {
        logger.info("Go Login Page");
        
        return "/Auth/login";
    }
    
    

    
}
