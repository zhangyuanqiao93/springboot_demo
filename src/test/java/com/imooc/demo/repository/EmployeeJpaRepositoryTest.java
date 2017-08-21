package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create By Bridge On 2017/8/21
 * Function:
 * Description: EmployeeRepositoryTest
 */
 public class EmployeeJpaRepositoryTest {
    private ApplicationContext context = null;
    private EmployeeJpaRepository employeeJpaRepository = null;

    @Before
    public void setContext(){
        //将配置文件的名称配置进来。ClassPathXmlApplicationContext
        context = new ClassPathXmlApplicationContext("beans-new.xml");
        employeeJpaRepository = context.getBean(EmployeeJpaRepository.class);//获取上下文
        System.out.println("setContext");
    }
    @After
    public void tearDown(){
        context = null;
        System.out.println("tearDown");
    }

    @Test
    public void getFind() {
        EmployeeEntity employeeEntity = employeeJpaRepository.findOne(99);
        System.out.println("employeeEntity:" + employeeEntity);
        System.out.println("employeeEntity(10):" + employeeJpaRepository.exists(10));
        System.out.println("employeeEntity(103):" + employeeJpaRepository.exists(103));
    }

}