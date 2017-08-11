package com.imooc.demo.config;

/**
 * Create By Bridge On 2017/8/11
 * Function:
 * Description:
 */

//@Configuration/**/
// 因为这个对象的扫描，需要在MyBatisConfig的后面注入，所以加上下面的注解
/*@AutoConfigureAfter(MyBatisConfig1.class)
public class MyBatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //获取之前注入的beanName为sqlSessionFactory的对象
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //指定xml配置文件的路径
        mapperScannerConfigurer.setBasePackage("com.imooc.demo.mapper");
        return mapperScannerConfigurer;
    }
}*/
