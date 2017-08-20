package com.imooc.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create By Bridge On 2017/8/18
 * Function:  测试beans-new.xml配置中的EntityManagerFactory，需要创建一个实体，
 * 看是否能自动配置生成一个数据库表
 * Description:
 */
public class SpringDataTest {

    private ApplicationContext context = null;

    @Before
    public void setContext(){
        //将配置文件的名称配置进来。
        context = new ClassPathXmlApplicationContext("beans-new.xml");
        System.out.println("setContext");
    }
    @After
    public void tearDown(){
        context = null;
        System.out.println("tearDown");
    }

    /**
     * 通过Entity自动创建表
     */
    @Test
    public void testEntityManagerFactory(){

    }
}
