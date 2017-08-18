package com.imooc.demo.dao;

import com.imooc.demo.entity.StudentEntity;
import org.junit.Test;

import java.util.List;

/**
 * Create By Bridge On 2017/8/16
 * Function:
 * Description:
            */
    public class StudentDAOImplTest {
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
        StudentDAO studentDAO = new StudentDAOImpl();
        StudentEntity student = new StudentEntity();
        student.setName("saveTest");
        student.setAge(25);
        studentDAO.save(student);
    }


}