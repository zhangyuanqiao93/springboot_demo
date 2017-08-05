package com.imooc.demo.handle;


import com.imooc.demo.entity.ResultEntity;
import com.imooc.demo.exception.GirlException;
import com.imooc.demo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create By Bridge On 2017/8/5
 * 异常的捕获
 */

@ControllerAdvice
public class ExceptionHandle {

    //spring 自带的一个日志框架,位于*****"org.slf4j.Logger"*****包中
    public static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class) //申明捕获的类
    @ResponseBody
    public ResultEntity handle(Exception e){

        //what is this.----> instanceof
        if (e instanceof GirlException){

            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }

        logger.error("【系统异常】---{}",e);

        return ResultUtil.error(-1,"未知错误"); //完成异常的捕获，不会在系统抛出

    }

}
