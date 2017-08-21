package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Create By Bridge On 2017/8/21
 * Function:
 * Description:  repository是Spring data 的核心注解，不提供任何的方法
 */


/**
 * 以下 是repository接口定义的规则
 * public interface ClassA extends Repository<T,ID extends Serializable>{}
 */
//Repository泛型，第一个参数传递的是实体对象，第二个是主键的ID
//@RepositoryDefinition(domainClass = EmployeeEntity.class,idClass = Integer.class)
public interface EmployeeCrudRepository extends CrudRepository<EmployeeEntity,Integer> {



}

