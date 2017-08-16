package com.imooc.demo.dao;

import com.imooc.demo.entity.StudentEntity;

import java.util.List;

/**
 * Create By Bridge On 2017/8/16
 * Function: StudentDAO访问接口
 * Description:
 */
public interface StudentDAO {

    /**
     * 查询所有学生
     * @return 所有学生
     */
    public List<StudentEntity> query();
}
