package com.imooc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Create By Bridge On 2017/8/18
 * Function: 雇员：先生成实体类===>自动生成数据库的表
 * Description:
 */


@Entity
public class EmployeeEntity {


    private Integer id;

    private String name;

    private Integer age;

    @GeneratedValue //id自增
    @Id//主键是id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Column(length = 20)
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
