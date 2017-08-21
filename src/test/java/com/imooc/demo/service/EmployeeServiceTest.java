package com.imooc.demo.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create By Bridge On 2017/8/21
 * Function:
 * Description:
 */
public class EmployeeServiceTest {

    private ApplicationContext context = null;
    //private EmployeeRepository employeeRepository = null;
    private EmployeeService employeeService=null;

    @Before
    public void setContext(){
        //将配置文件的名称配置进来。ClassPathXmlApplicationContext
        context = new ClassPathXmlApplicationContext("beans-new.xml");
        employeeService = context.getBean(EmployeeService.class);//获取上下文
        System.out.println("setContext");
    }
    @After
    public void tearDown(){
        context = null;
        System.out.println("tearDown");
    }

    @Test
    public void updateAgeById() throws Exception {
        employeeService.updateAgeById(1,33);
    }

}