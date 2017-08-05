package com.imooc.demo.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Create By Bridge on 2017/8/02
 */

//Entity 在数据库中对应着一个表
@Entity
public class GirlEntity {

    @Id
    @GeneratedValue   //id自增
    private Integer id;

    @NotBlank(message = "字段必填")
    private String cupSize;

    @Min(value = 18,message = "未成年少女禁止入内")
    private Integer age;

    @NotNull(message = "金額必填！")
    private Double money;

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }







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

    @Override
    public String toString() {
        return "GirlEntity{" +
                "id=" + id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                '}';
    }

    public GirlEntity() {

       //无参数构造方法
    }
}
