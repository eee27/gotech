package com.eee27go.gotech.Core.Config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * By: eee27
 * Date: 2018/6/26 21:53
 */

@Aspect
@Configuration
public class Aop {
    // 定义切点Pointcut
    @Pointcut("execution(* com.eee27go.gotech.*.*(..))")
    public void aopCut() {
    }

    @Around("aopCut()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        //System.out.println("[DoAround：Before]------------------环绕  Before ");
        Object result = pjp.proceed();
        //System.out.println("[DoAround：After]------------------环绕  After : 结果是 " +result);
        return result;
    }


    @Before("aopCut()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        System.out.println("[注解：Before]------------------切面  Before");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        System.out.println("[注解：Before]浏览器输入的网址=URL : " + request.getRequestURL().toString());
        System.out.println("[注解：Before]HTTP_METHOD : " + request.getMethod());
        System.out.println("[注解：Before]IP : " + request.getRemoteAddr());
        System.out.println("[注解：Before]执行的业务方法名=CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        System.out.println("[注解：Before]业务方法获得的参数=ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }


    @After("aopCut()")
    public void after(JoinPoint jp){
        System.out.println("[注解：After]方法最后执行.....");
    }

    //后置异常通知
    @AfterThrowing("aopCut()")
    public void throwsEx(JoinPoint jp){
        System.out.println("[注解：AfterThrowing]方法异常时执行.....");
    }

    @AfterReturning(returning = "ret", pointcut = "aopCut()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        System.out.println("[注解：AfterReturning]这个会在切面最后的最后打印，方法的返回值 : " + ret);
    }

}
