package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Create By Bridge On 2017/8/21
 * Function:
 * Description:
 */
public interface EmployeeJpaSpecificationExecutorRepository extends
        JpaRepository<EmployeeEntity,Integer> ,JpaSpecificationExecutor<EmployeeEntity> {



}
