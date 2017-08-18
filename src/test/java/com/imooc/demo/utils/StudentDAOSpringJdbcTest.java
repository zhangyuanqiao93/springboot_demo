package com.imooc.demo.utils;

import com.imooc.demo.dao.StudentDAO;
import com.imooc.demo.dao.StudentDAOImpl;
import com.imooc.demo.entity.StudentEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.util.List;

/**
 * Create By Bridge On 2017/8/18
 * Function: 测试JDBC的Template配置
 * Description:
 */
public class StudentDAOSpringJdbcTest {
    private ApplicationContext context = null;
    private StudentDAO studentDAO = null;


    @Before
    public void setContext(){
        //将配置文件的名称配置进来。
        context = new ClassPathXmlApplicationContext("beans.xml");
        studentDAO = (StudentDAO) context.getBean("studentDAO");
        System.out.println("setContext");
    }
    @After
    public void tearDown(){
        context = null;
        System.out.println("tearDown");
    }

    @Test
    public void testDataSource(){
        System.out.println("testDataSource");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Assert.notNull(dataSource);
    }

    @Test
    public void testJdbcTemplate(){
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        Assert.notNull(jdbcTemplate);
    }

    @Test
    public void queryTest() throws Exception {
        StudentDAO studentDAO = new StudentDAOImpl();
        List<StudentEntity> students = studentDAO.query();
        for (StudentEntity student : students){
            System.out.println("id: " + student.getId() +
                    ","+ "name: " + student.getName()+
                    ","+ "age: " + student.getAge());
        }
    }

    /**
     * save 方法测试
     * @throws Exception
     */
    @Test
    public void saveTest(){
        StudentEntity student = new StudentEntity();
        student.setName("save");
        student.setAge(20);
        studentDAO.save(student);
    }

}

