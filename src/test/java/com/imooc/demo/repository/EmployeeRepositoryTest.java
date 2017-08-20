package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By Bridge On 2017/8/18
 * Function:
 * Description: EmployeeRepositoryTest
 */
 public class EmployeeRepositoryTest {
    private ApplicationContext context = null;
    private EmployeeRepository employeeRepository = null;

    @Before
    public void setContext(){
        //将配置文件的名称配置进来。ClassPathXmlApplicationContext
        context = new ClassPathXmlApplicationContext("beans-new.xml");
        employeeRepository = context.getBean(EmployeeRepository.class);//获取上下文
        System.out.println("setContext");
    }
    @After
    public void tearDown(){
        context = null;
        System.out.println("tearDown");
    }

    @Test
    public void testFindByName(){

        System.out.println(employeeRepository);//org.springframework.data.jpa.repository.support.SimpleJpaRepository@764cba
        EmployeeEntity employee  = employeeRepository.findByName("xx");
        //System.out.println(employee);
        System.out.println("id: " +  employee.getId()+
                ",name " +  employee.getName()+
                ",age: " +  employee.getAge());
    }

    @Test
    public void  testFindByNameStartingWithAndAgeLessThan(){
         List<EmployeeEntity> employeeEntities = employeeRepository.findByNameStartingWithAndAgeLessThan("test",22);
        for (EmployeeEntity employee : employeeEntities) {
            System.out.println("id: " +  employee.getId()+
                    ",name " +  employee.getName()+
                    ",age: " +  employee.getAge());
        }
    }

    //findByNameEndingWithAndAgeLessThan
    @Test
    public void  testFindByNameEndingWithAndAgeLessThan(){
        List<EmployeeEntity> employeeEntities = employeeRepository.findByNameEndingWithAndAgeLessThan("6",25);
        for (EmployeeEntity employee : employeeEntities) {
            System.out.println("id: " +  employee.getId()+
                    ",name " +  employee.getName()+
                    ",age: " +  employee.getAge());
        }
    }


    //findByNameInOrAgeLessThan
    @Test
    public void  testFindByNameInOrAgeLessThan(){
        List<String> names  = new ArrayList<>();
        names.add("test1");
        names.add("test2");
        names.add("test3");

        List<EmployeeEntity> employeeEntities = employeeRepository.findByNameInOrAgeLessThan(names,22);

        for (EmployeeEntity employee : employeeEntities) {
            System.out.println("id: " +  employee.getId()+
                    ",name " +  employee.getName()+
                    ",age: " +  employee.getAge());
        }
    }
    //findByNameInAndAgeLessThan
    @Test
    public void  testFindByNameInAndAgeLessThan() {
        List<String> names = new ArrayList<>();
        names.add("test1");
        names.add("test2");
        names.add("test3");

        List<EmployeeEntity> employeeEntities = employeeRepository.findByNameInAndAgeLessThan(names, 22);

        for (EmployeeEntity employee : employeeEntities) {
            System.out.println("id: " + employee.getId() +
                    ",name " + employee.getName() +
                    ",age: " + employee.getAge());
        }
    }

}