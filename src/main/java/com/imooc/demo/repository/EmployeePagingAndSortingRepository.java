package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Create By Bridge On 2017/8/21
 * Function:
 * Description:
 */
public interface EmployeePagingAndSortingRepository extends PagingAndSortingRepository<EmployeeEntity,Integer> {



}
