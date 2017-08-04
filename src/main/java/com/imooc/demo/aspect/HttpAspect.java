package com.imooc.demo.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 *
 * Create By Bridge on 2017/8/4
 * function: AOP统一处理日志（AOP：面向切面编程）
 */
@Aspect
@Component //引入到Spring 容器中
public class HttpAspect {

    //spring 自带的一个日志框架,位于*****"org.slf4j.Logger"*****包中
    public static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    //创建一个公共方法public void log(){}

    @Pointcut("execution(public * com.imooc.demo.controller.GirlController.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefor(){

        System.out.println("首次被拦截！");
    }

    @After("log()")
    public void doAfter(){
        System.out.println("再次被拦截！");
    }

}
