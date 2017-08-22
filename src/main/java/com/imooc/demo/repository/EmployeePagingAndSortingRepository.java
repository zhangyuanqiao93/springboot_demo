package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Create By Bridge On 2017/8/21
 * Function:PagingAndSortingRepository
 * Description:实现分页和排序的接口
 */
public interface EmployeePagingAndSortingRepository extends
        PagingAndSortingRepository<EmployeeEntity,Integer> {

}
