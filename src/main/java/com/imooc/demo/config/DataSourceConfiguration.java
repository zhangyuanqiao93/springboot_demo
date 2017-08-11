package com.imooc.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Create By Bridge On 2017/8/11
 * Function: DataSourceConfiguration
 * Description: DataSourceConfiguration
 */


@Configuration
@PropertySource("classpath:prop.properties")//@PropertySource注解导入增加的prop.properties jdbc配置文件
public class DataSourceConfiguration {

    //通过类型安全的配置@ConfigurationProperties()

    @Value("${jdbc.driver}")//driver
    private String driver;
    @Value("${jdbc.url}")//url
    private String url;
    @Value("${jdbc.username}")//username
    private String username;
    @Value("${jdbc.password}")//password
    private String password;
    @Value("${jdbc.maxActive}")//maxActive
    private int maxActive;
    @Value("${jdbc.maxIdel}")//maxIdel
    private int maxIdel;
    @Value("${jdbc.maxWait}")//maxWait
    private long maxWait;


    public String getDataSource(){

        return "url: " + url + " username: " + username;

    }


//    @Bean
//    public DataSource dataSource;

}
