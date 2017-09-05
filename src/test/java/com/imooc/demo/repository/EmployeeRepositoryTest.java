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
//        System.out.println("id: " +  employee.getId()+
//                ",name " +  employee.getName()+
//                ",age: " +  employee.getAge());
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

    /**
     * 通过注解@Query，解决repository方法命名规范问题
     * function: 测试 getEmployeeEntityById
     */
    @Test
    public void  testGetEmployeeEntityById() {
        EmployeeEntity employee = employeeRepository.getEmployeeEntityById();
        System.out.println("id: " + employee.getId() +
                ",name " + employee.getName() +
                ",age: " + employee.getAge());
    }

    //queryParam1
    @Test
    public void  testQueryParam1() {
        List<EmployeeEntity> employeeEntities = employeeRepository.queryParam1("xx",23);
        for (EmployeeEntity employee : employeeEntities) {
            System.out.println("id: " + employee.getId() +
                    ",name " + employee.getName() +
                    ",age: " + employee.getAge());
        }
    }


    //queryParam2
    @Test
    public void  testQueryParam2() {
        List<EmployeeEntity> employeeEntities = employeeRepository.queryParam2("xx",23);
        for (EmployeeEntity employee : employeeEntities) {
            System.out.println("id: " + employee.getId() +
                    ",name " + employee.getName() +
                    ",age: " + employee.getAge());
        }
    }

    //    queryLike1
    @Test
    public void  testQueryLike1() {
        List<EmployeeEntity> employeeEntities = employeeRepository.queryLike1("test");
        for (EmployeeEntity employee : employeeEntities) {
            System.out.println("id: " + employee.getId() +
                    ",name " + employee.getName() +
                    ",age: " + employee.getAge());
        }
    }

    //    queryLike2
    @Test
    public void  testQueryLike2() {
        List<EmployeeEntity> employeeEntities = employeeRepository.queryLike2("test1");
        for (EmployeeEntity employee : employeeEntities) {
            System.out.println("id: " + employee.getId() +
                    ",name " + employee.getName() +
                    ",age: " + employee.getAge());
        }
    }

    /**
     * @Date;17/8/21
     * grid();直接使用sql语句
     *
     * List<Map<String,Object>>
     */
/*
    @Test
    public void testGrid(){
//        return null;
    }
*/

    //getCount
    @Test
    public void testGetCount(){
        long count = employeeRepository.getCount();
        System.out.println("count: "+ count);
    }


    /**
     * 根据id   update  age
     */

    /**
     * 运行报错：update/delete query; nested exception is javax.persistence.TransactionRequiredException: Executing an update/delete query
     * 错误解决方案:在@Modifying后面加@Transactional
     */

    @Test
    public void testUpdateAgeById(){
        employeeRepository.updateAgeById(1,12);
    }
}