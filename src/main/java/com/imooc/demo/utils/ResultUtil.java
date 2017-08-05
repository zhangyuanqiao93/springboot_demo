package com.imooc.demo.utils;

import com.imooc.demo.entity.ResultEntity;


/**
 * Create By Bridge On 2017/8/5
 * function: ResultUtil 包装工具类，简化代码,完成对数据的封装
 */
public class ResultUtil {

    public static ResultEntity success(Object object){

        ResultEntity result = new ResultEntity();

        result.setCoede(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static ResultEntity success(){
        return success(null);//传入的对象是null
    }

    public static ResultEntity error(Integer code, String msg){

        ResultEntity result = new ResultEntity();
        result.setCoede(code);
        result.setMsg(msg);
        return result;
    }
}
