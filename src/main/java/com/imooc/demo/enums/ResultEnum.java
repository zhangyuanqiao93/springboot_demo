package com.imooc.demo.enums;


/**
 * enum 统一错误日志信息管理
 */
public enum  ResultEnum {
    ;

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;

    }
}
