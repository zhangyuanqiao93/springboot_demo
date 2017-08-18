package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.springframework.data.repository.Repository;

/**
 * Create By Bridge On 2017/8/18
 * Function: spring data Demo
 * Description:
 */
//Repository泛型，第一个参数传递的是实体对象，第二个是主键的ID
public interface EmployeeRepository extends Repository<EmployeeEntity,Integer>{

    EmployeeEntity findByName(String name);
}
