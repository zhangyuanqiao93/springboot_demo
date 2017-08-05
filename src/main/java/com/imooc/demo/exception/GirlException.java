package com.imooc.demo.exception;

/**
 * Create By Bridge On 2017/8/5
 * 统一异常处理，以及事务回滚
 * Spring 框架中对事务回滚处理用的是;RuntimeException
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(Integer code,String message) {
        super(message); //父类的构造方法本身就可以传入一个message
        this.code = code;
    }

    public Integer getCode() {
        return code;

    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
