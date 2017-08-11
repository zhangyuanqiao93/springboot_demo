/*
package com.imooc.demo.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import java.util.Properties;

*/
/**
 * Create By Bridge On 2017/8/11
 * Function:
 * Description:
 *//*


@Configuration //@Configuration注解（该注解类似于spring的配置文件
@MapperScan(basePackages = "com.imooc.demo.dao")//@MapperScan注解，指定扫描的mapper接口所在的包
public class MybatisConfig implements EnvironmentAware{

    @Autowired
    private Environment env;

    @Override
    public void setEnvironment(Environment environment) {
        this.env = environment;
    }
    */
/**
     * 创建数据源
     * @Primary 该注解表示在同一个接口有多个实现类可以注入的时候，
     * 默认选择哪一个，而不是让@autowire注解报错
     *//*


    @Bean
    @Primary
    public DataSource getDataSource() throws Exception {

        Properties pros = new Properties();
        pros.put("driverClassName", env.getProperty("spring.datasource.driver-class-name"));
        pros.put("url", env.getProperty("spring.datasource.url"));
        pros.put("username", env.getProperty("spring.datasource.username"));
        pros.put("password", env.getProperty("spring.datasource.password"));

        return (DataSource) DruidDataSourceFactory.createDataSource(pros);
//        return null;
    }

    */
/**
     * 根据数据源创建SqlSessionFactory
     *//*

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception{
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(ds);//指定数据源(这个必须有，否则报错)
        //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        //fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));//指定基包
        //fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));//指定xml文件位置
        return fb.getObject();
    }


}
*/
