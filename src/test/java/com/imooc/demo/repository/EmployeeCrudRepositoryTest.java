package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import com.imooc.demo.service.EmployeeService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By Bridge On 2017/8/21
 * Function:
 * Description: EmployeeRepositoryTest
 */
 public class EmployeeCrudRepositoryTest {
    private ApplicationContext context = null;
    private EmployeeService employeeService = null;

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
    public void testSave(){

        List<EmployeeEntity> employeeEntities = new ArrayList<>();
        EmployeeEntity employeeEntity = null;
        for (int i = 0; i < 100; i++) {

            employeeEntity = new EmployeeEntity();
            employeeEntity.setName("test" + i);
            employeeEntity.setAge(100-i);
            employeeEntities.add(employeeEntity);
        }
        employeeService.save(employeeEntities);
    }

}