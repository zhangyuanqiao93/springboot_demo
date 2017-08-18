package com.imooc.demo.dao;

import com.imooc.demo.entity.StudentEntity;
import com.imooc.demo.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Create By Bridge On 2017/8/16
 * Function: StudentDAO接口实现类，通过最原始的JDBC方式操作
 * Description:
 */
public class StudentDAOImpl implements StudentDAO{


    @Override
    public List<StudentEntity> query() {

        List<StudentEntity> students = new ArrayList<>();
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String  sql = "SELECT  id,name,age FROM student";
        try {
            conn = JDBCUtil.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();//执行一个查询

            StudentEntity student = null;
            while(resultSet.next()){

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                //System.out.println("id = " + id+ "name = "+ name+ "age = "+age);

                student = new StudentEntity();
                student.setId(id);
                student.setName(name);
                student.setAge(age);//坑

                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭连接
            JDBCUtil.release(resultSet,preparedStatement,conn);
        }

        return students;

    }

    @Override
    public void save(StudentEntity student) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
//        Statement statement = null;
        ResultSet resultSet = null;
        String  sql = "insert into student(name,age) values(?,?) ";
        try {
            conn = JDBCUtil.getConnection();
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setInt(2,student.getAge());
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭连接
            JDBCUtil.release(resultSet,preparedStatement,conn);
        }
    }
}
