package com.imooc.demo.entity;

/**
 * Create By Bridge On 2017/8/16
 * Function:
 * Description:
 */
//@Entity
public class StudentEntity {

    /**
     * 主键字段，自增
     */
//    @Id
//    @GeneratedValue   //主键自增
    private int id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
