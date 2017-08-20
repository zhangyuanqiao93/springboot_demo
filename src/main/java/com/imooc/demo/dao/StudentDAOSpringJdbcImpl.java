package com.imooc.demo.dao;

import com.imooc.demo.entity.StudentEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By Bridge On 2017/8/18
 * Function: StudentDAO接口实现类，通过Spring-JDBC方式操作
 * Description:
 */
public class StudentDAOSpringJdbcImpl implements StudentDAO{

    private JdbcTemplate jdbcTemplate;

    @Override
    public List<StudentEntity> query() {

        List<StudentEntity> students = new ArrayList<>();
        String  sql = "SELECT  id,name,age FROM student";

        jdbcTemplate.query(sql, rs -> {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            //System.out.println("id = " + id+ "name = "+ name+ "age = "+age);
            StudentEntity student = new StudentEntity();
            student.setId(id);
            student.setName(name);
            student.setAge(age);//坑

            students.add(student);
        });
        return students;
    }

    /**
     *  ！！！该方法测试未通过
     * @param student 待添加的学生
     */
    @Override
    public void save(StudentEntity student) {
        String  sql = "insert into student(name,age) values(?,?) ";
//        jdbcTemplate.update(sql, student.getName(),student.getAge());
        jdbcTemplate.update(sql, student.getName(),student.getAge());
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
