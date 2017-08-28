package com.imooc.demo.entity;

import javax.persistence.Entity;
import java.util.Date;
import java.util.Set;

/**
 * Create By Bridge On 2017/8/28
 * Function: 使用java bean的方式构建json对象
 * Description:
 */
@Entity
public class StudentWithBirthDay {

    //@SerializedName("NAME")
    private String name;
    private double age;
    private String school;
    private boolean has_girlfriend;
    private Object car;
    private Object house;
    /**
     * 定义一个日期类型是Date，不是Data！！！
     */
    private Date birthday;

    //    private String[] profession;
    private Set<String> profession;
    private String comment;
    public Set<String> getProfession() {
        return profession;
    }

    public void setProfession(Set<String> profession) {
        this.profession = profession;
    }


    @Override
    public String toString() {
        return "StudentWithBirthDay{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school='" + school + '\'' +
                ", has_girlfriend=" + has_girlfriend +
                ", car=" + car +
                ", house=" + house +
                ", birthday=" + birthday +
                ", profession=" + profession +
                ", comment='" + comment + '\'' +
                ", ignore='" + ignore + '\'' +
                '}';
    }


//隐藏部分属性
    //@Transient
    /**
     * transient关键字
     * 1）一旦变量被transient修饰，变量将不再是对象持久化的一部分，该变量内容在序列化后无法获得访问。

     * 2）transient关键字只能修饰变量，而不能修饰方法和类。注意，本地变量是不能被transient关键字修饰的。变量如果是用户自定义类变量，则该类需要实现Serializable接口。

     * 3）被transient关键字修饰的变量不再能被序列化，一个静态变量不管是否被transient修饰，均不能被序列化。
     *
     * 传送门：http://www.importnew.com/21517.html
     */
    private transient String ignore;

    public String getIgnore() {
        return ignore;
    }

    public void setIgnore(String ignore) {
        this.ignore = ignore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isHas_girlfriend() {
        return has_girlfriend;
    }

    public void setHas_girlfriend(boolean has_girlfriend) {
        this.has_girlfriend = has_girlfriend;
    }

    public Object getCar() {
        return car;
    }

    public void setCar(Object car) {
        this.car = car;
    }

    public Object getHouse() {
        return house;
    }

    public void setHouse(Object house) {
        this.house = house;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
