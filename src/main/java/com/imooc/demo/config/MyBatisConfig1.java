package com.imooc.demo.config;

/**
 * Create By Bridge On 2017/8/7
 * Function: MybatisConfig 配置
 * Description:
 */

/*@Configuration
//支持事务
@EnableTransactionManagement
public class MyBatisConfig1 implements TransactionManagementConfigurer {*/

  /*  @Autowired
    private DataSource dataSource;
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(){

        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        try {
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }*/
/*}*/
