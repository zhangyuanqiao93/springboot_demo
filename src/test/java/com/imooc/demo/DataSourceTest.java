package com.imooc.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;

import javax.sql.DataSource;

/**
 * Create By Bridge On 2017/8/18
 * Function: 测试beans文件配置数据库的操作，检测是否成功配置
 * Description:
 */
public class DataSourceTest {
    private ApplicationContext context = null;

    @Before
    public void setContext(){
        //将配置文件的名称配置进来。
        context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("setContext");
    }
    @After
    public void tearDown(){
        context = null;
        System.out.println("tearDown");
    }

    @Test
    public void testDataSource(){
        System.out.println("testDataSource");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Assert.notNull(dataSource);
    }

    @Test
    public void testJdbcTemplate(){
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        Assert.notNull(jdbcTemplate);
    }

}

