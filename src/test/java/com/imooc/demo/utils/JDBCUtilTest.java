package com.imooc.demo.utils;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Create By Bridge On 2017/8/16
 * Function:
 * Description:
 */
public class JDBCUtilTest {
    @Test
    public void getConnection() throws Exception {

        Connection conn = JDBCUtil.getConnection();

        Assert.assertNotNull(conn);
    }

}