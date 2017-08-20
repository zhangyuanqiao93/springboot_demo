package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.springframework.data.repository.Repository;

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
     * @return
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
}

