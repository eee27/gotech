package com.eee27go.gotech.Core.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * By: eee27
 * Date: 2018/6/27 22:07
 */
@Configuration
public class Interceptor extends WebMvcConfigurerAdapter {

    @Bean
    public SecurityInterceptor getSecurityInterceptor() {
        return new SecurityInterceptor();
    }

    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());
        //排除的路径
        addInterceptor.excludePathPatterns("/error");
        addInterceptor.excludePathPatterns("/index");
        addInterceptor.excludePathPatterns("/login");
        //拦截所有路径
        addInterceptor.addPathPatterns("/**");
    }

    private class SecurityInterceptor extends HandlerInterceptorAdapter {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
            HttpSession session = request.getSession();
            System.out.println("[Interceptor：Check]------------------This Page Should Take UserId ");
            //获取session
            /*HttpSession session = request.getSession(true);
            //判断用户ID是否存在，不存在就跳转到登录界面
            if(session.getAttribute("userId") == null){
                response.sendRedirect(request.getContextPath()+"/admin/login");
                return false;
            }else{
                session.setAttribute("userId", session.getAttribute("userId"));
                return true;
            }
            */
            return true;
        }

        @Override
        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                               ModelAndView modelAndView) throws Exception {
            // TODO Auto-generated method stub

        }

        @Override
        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
                throws Exception {
            // TODO Auto-generated method stub

        }
    }

}
