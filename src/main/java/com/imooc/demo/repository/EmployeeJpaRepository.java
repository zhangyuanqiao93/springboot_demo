package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Create By Bridge On 2017/8/21
 * Function:
 * Description:
 */
public interface EmployeeJpaRepository extends JpaRepository<EmployeeEntity,Integer> {



}
