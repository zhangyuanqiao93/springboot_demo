package com.imooc.demo.dao;

import com.imooc.demo.entity.StudentEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Create By Bridge On 2017/8/16
 * Function:
 * Description:
            */
    public class StudentDAOSpringJdbcImplTest {

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
        public void queryTest() throws Exception {
            //StudentDAO studentDAO = new StudentDAOImpl();
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
        //StudentDAO studentDAO = new StudentDAOImpl();
        StudentEntity student = new StudentEntity();
        student.setName("save-jdbc");
        student.setAge(25);
        studentDAO.save(student);
    }


}