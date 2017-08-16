package com.imooc.demo.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Create By Bridge On 2017/8/16
 * Function: JDBC 工具类，连接MySQL数据库
 * Description:
 */
@ConfigurationProperties
public class JDBCUtil {
    /**
     * 配置性的建议写到配置文件中。
     *
     */

  /*  private static final String driverClass = "com.mysql.jdbc.Driver";
    private static final String userName = "root";
    private static final String password = "123456";
    private static final String url = "jdbc:mysql://localhost:3306/spring_data?characterEncoding=utf8&useSSL=true";
*/
    /**
     * 获取Connection
     * @return  所获得到的JDBC的Connection
     */
    public static Connection getConnection() throws Exception {

        InputStream stream = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(stream);


        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");
        String driverClass = properties.getProperty("jdbc.driverClass");
        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(url,username,password);
        return conn;
    }

    /**
     * 释放db相关资源
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void release(ResultSet resultSet,
                               Statement statement,
                               Connection connection){
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
