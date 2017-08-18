package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create By Bridge On 2017/8/18
 * Function:
 * Description: EmployeeRepositoryTest
 */
public class EmployeeRepositoryTest {

    private ApplicationContext context = null;
    private EmployeeRepository repository = null;

    @Before
    public void setContext(){
        //将配置文件的名称配置进来。
        context = new ClassPathXmlApplicationContext("beans-new.xml");
        repository = (EmployeeRepository) context.getBean(EmployeeEntity.class);
        System.out.println("setContext");
    }
    @After
    public void tearDown(){
        context = null;
        System.out.println("tearDown");
    }


    @Test
    public void testFindByName(){
        System.out.println(repository);

        EmployeeEntity employeeEntity = repository.findByName("xx");
        System.out.println("ID: " + employeeEntity.getId()
                + ", Name；"
                + employeeEntity.getName()
        +"Age: " + employeeEntity.getAge());
    }

}