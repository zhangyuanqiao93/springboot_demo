package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Create By Bridge On 2017/8/18
 * Function: spring data Demo
 * Description:  repository是Spring data 的核心注解，不提供任何的方法
 */


/**
 * 以下 是repository接口定义的规则
 * public interface ClassA extends Repository<T,ID extends Serializable>{}
 */
//Repository泛型，第一个参数传递的是实体对象，第二个是主键的ID
//@RepositoryDefinition(domainClass = EmployeeEntity.class,idClass = Integer.class)
public interface EmployeeRepository extends Repository<EmployeeEntity,Integer> {


    /**
     * 注解：annotation
     * 在申明方法名的是时候一定要按照一定的规则
     *
     * @param name
     * @return EmployeeEntity
     */
    public EmployeeEntity findByName(String name);

    //where name like %? and age<?:以什么开始
    public List<EmployeeEntity> findByNameStartingWithAndAgeLessThan(String name, Integer age);

    //where name like ?% and age<?:以什么结束
    public List<EmployeeEntity> findByNameEndingWithAndAgeLessThan(String name, Integer age);

    //where name in (?,?...) or age<?   以什么结束
    public List<EmployeeEntity> findByNameInOrAgeLessThan(List<String> names, Integer age);

    //where name in (?,?...) and age<?
    public List<EmployeeEntity> findByNameInAndAgeLessThan(List<String> names, Integer age);


    /**
     * *****-----@Query注解的使用----*****
     * @return EmployeeEntity
     * 注意;在查询语句中的EmployeeEntity是类名，不是表名字
     */
    @Query("select emp from EmployeeEntity emp where id = (select  max(id) from EmployeeEntity t1) ")
    public EmployeeEntity getEmployeeEntityById();

    @Query("select emp from EmployeeEntity emp where  emp.name=?1 and emp.age=?2")//1，2表示占位符
    public List<EmployeeEntity> queryParam1(String name, Integer age);


    /**
     *  @Date;17/8/21
     * 直接使用sql
     *//*
    @Query(nativeQuery = true,value = "SELECT * FROM employeeentity")
    public List<Map<String,Object>>  grid();*/


    /**
     *  @Date;17/8/21
     *  直接传递参数的方法,使用":"连接,emp.name=:name and emp.age=:age
     */
    @Query("select emp from EmployeeEntity emp where  emp.name=?1 and emp.age=?2")//1，2表示占位符
    public List<EmployeeEntity> queryParam2(@Param("name") String name, @Param("age") Integer age);


    /**
     * like1
     * @param name
     * @return
     */
    @Query("select emp from EmployeeEntity emp where  emp.name  like %?1%")//可测试通过。
    public List<EmployeeEntity> queryLike1(String name);

    /**
     * like2  使用:name 的形式，始终不能通过测试，报错提示没有绑定参数。
     * @param name
     * @return
     */
    @Query("select o from EmployeeEntity o where o.name like %?1%")
    public List<EmployeeEntity> queryLike2(@Param("name")String name);

    @Query(nativeQuery = true,value ="SELECT count(1) FROM employeeentity" )
    public long getCount();

    @Modifying
    @Transactional//添加事务注解
    @Query("update EmployeeEntity emp set age= ?2 where emp.id = ?1")
    //@Query("update EmployeeEntity emp set age= :age where emp.id = :id")
    public void updateAgeById(@Param("id") Integer id, @Param("age") Integer age);
}

