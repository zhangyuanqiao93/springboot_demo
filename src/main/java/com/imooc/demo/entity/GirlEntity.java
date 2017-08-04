package com.imooc.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Create By Bridge on 2017/8/02
 */

//Entity 在数据库中对应着一个表
@Entity
public class GirlEntity {

    @Id
    @GeneratedValue   //id自增
    private Integer id;

    private String cupSize;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public GirlEntity() {

       //无参数构造方法
    }
}
