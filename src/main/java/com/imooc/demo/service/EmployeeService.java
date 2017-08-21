package com.imooc.demo.service;

import com.imooc.demo.entity.EmployeeEntity;
import com.imooc.demo.repository.EmployeeCrudRepository;
import com.imooc.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create By Bridge On 2017/8/21
 * Function: EmployeeService管理事务
 * Description:
 */


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeCrudRepository employeeCrudRepository;

    @Transactional
    public void save(List<EmployeeEntity> employeeEntities){
        employeeCrudRepository.save(employeeEntities);
    }

    @Transactional
    public void updateAgeById(Integer id,Integer age){

        employeeRepository.updateAgeById(id,age);
    }
}
