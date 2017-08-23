package com.imooc.demo.echarts;

import com.github.abel533.echarts.Option;
import com.github.pagehelper.PageHelper;

/**
 * Create By Bridge On 2017/8/23
 * Function:
 * Description:
 */
public class E_Charts_Demo{

    //@Override
    public Option selectRemoveCauses(){

        /**
         * startPage: 开始分页
         *
         * @param pageNum  页码
         * @param pageSize 每页显示数量
         * @param count    是否进行count查询
         */
        //查询前20
        PageHelper.startPage(1,20,false);
        //数据库查询获取统计数据
        return null;
    }

}
