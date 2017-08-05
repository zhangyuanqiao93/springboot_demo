package com.imooc.demo.enums;


/**
 * enum 统一错误日志信息管理
 */
public enum  ResultEnum {
    /**
     * 枚举类，枚举异常code以及异常的信息message
     */
    UNKOWN_ERROR(-1,"未知错误"),
    SECCESS(0,"成功"),
    COLLEGE(99,"你可能在上大学"),
    GRADUATE(101,"可能在上研究生"),
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
