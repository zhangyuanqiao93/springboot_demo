package com.imooc.demo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;


/**
 *
 * Create By Bridge on 2017/8/4
 * function: AOP统一处理日志（AOP：面向切面编程）
 */
@Aspect  //面向切面编程，声明是一个切面
@Component //引入到Spring 容器中;让此切面成为Spring 中管理的Bean
public class HttpAspect {

    //spring 自带的一个日志框架,位于*****"org.slf4j.Logger"*****包中
    public static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    //创建一个公共方法public void log(){}

    @Pointcut("execution(public * com.imooc.demo.controller.GirlController.*(..))") //声明切点
    public void log(){

    }

    @Before("log()")
    public void doBefor(JoinPoint joinPoint ){

        //url
        ServletRequestAttributes attributes = (ServletRequestAttributes)  RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest(); //属于这个包：javax.servlet.http.HttpServletRequest;
        logger.info("url:{}",request.getRequestURL());

        //method
        logger.info("method:{}",request.getMethod());

        //ip
        logger.info("ip:{}",request.getRemoteAddr());

        //类方法
        logger.info("class_method:{}",joinPoint.getSignature().getDeclaringTypeName()
                + "."
                + joinPoint.getSignature().getName());

        //参数
        logger.info("args:{}", joinPoint.getArgs());

    }

    @After("log()")  //使用@After声明一个建言，并使用@PointCut定义的切点
    public void doAfter(){
        System.out.println("再次被拦截！");
        logger.info("information 456");
    }

    /**
     * @Author: Bridge
     * @Decription:  编写面向切面编程
     * @Data:   2017/8/13
     */

    @After("log()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method =  signature.getMethod();
        String name = method.getName();
        logger.info(name);


//        Action action = method.getAnnotation(Action.class);

    }

    @AfterReturning(returning = "object" ,pointcut = "log()")
    public void doAfterReturning(Object object){
//        logger.info("response={}",object.toString());
    }
}
