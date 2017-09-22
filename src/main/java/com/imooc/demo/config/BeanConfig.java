package com.imooc.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Create By Bridge On 2017/9/22
 * Function: 通过 Java Config 创建 dataSource 和jdbcTemplate。
 * Description: 通过 Java Config 创建 dataSource 和jdbcTemplate。
 */

@Configuration
@EnableTransactionManagement
@PropertySource(value = "classpath:db.properties")
public class BeanConfig {
    //配置javaConfig


    @Autowired
    private Environment env;

    @Bean(destroyMethod = "close")
    public DruidDataSource dataSource(){

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(env.getProperty("db.driverClassName").trim());
        dataSource.setUrl(env.getProperty("db.url").trim());
        dataSource.setUsername(env.getProperty("db.username").trim());
        dataSource.setPassword(env.getProperty("db.password").trim());
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());

        return jdbcTemplate;
    }


}
