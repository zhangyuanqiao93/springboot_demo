package com.imooc.demo.repository;

import com.imooc.demo.entity.EmployeeEntity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * Create By Bridge On 2017/8/21
 * Function:
 * Description: EmployeeRepositoryTest
 */
 public class EmployeePagingAndSortingRepositoryTest {
    private ApplicationContext context = null;
    private EmployeePagingAndSortingRepository employeePagingAndSortingRepository = null;

    @Before
    public void setContext(){
        //将配置文件的名称配置进来。ClassPathXmlApplicationContext
        context = new ClassPathXmlApplicationContext("beans-new.xml");
        employeePagingAndSortingRepository = context.getBean(EmployeePagingAndSortingRepository.class);//获取上下文
        System.out.println("setContext");
    }
    @After
    public void tearDown(){
        context = null;
        System.out.println("tearDown");
    }

    /**
     * Author:Bridge
     * function： Spring Data的 分页和排序
     *
     */
    @Test
    public void getPage(){

        //根据id排序,Sort.Direction.DESC降序排列
        //根据id排序,Sort.Direction.ASC升序排列
        Sort.Order order = new Sort.Order(Sort.Direction.ASC,"id");
        Sort sort = new Sort(order);
        //index默认从0开始的，每页显示5条记录
        Pageable pageable = new PageRequest(0,5,sort);
        Page<EmployeeEntity> page = employeePagingAndSortingRepository.findAll(pageable);
        System.out.println("查询的总页数: " + page.getTotalPages());
        System.out.println("查询的总记录数: " + page.getTotalElements());
        System.out.println("查询的当前第几页: " + (page.getNumber()+1));
        System.out.println("查询当前当前页面的集合: " + page.getContent());
        System.out.println("查询的当前页面的记录数: " + page.getNumberOfElements());
    }

}