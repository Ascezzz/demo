package com.asce.springbootDemo.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
@Slf4j
public class LogPrintAspect {

    @Pointcut("execution(public * com.asce.springbootDemo.controller..*.*(..))")
    public void point(){}

    @Before("point()")
    public void before(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        String path = null;
        if(null != attributes){
            HttpServletRequest request = attributes.getRequest();
            path = request.getServletPath();
        }
        log.info("Aspect.Request path:{},param:{}",path, Arrays.toString(joinPoint.getArgs()));
    }

}
