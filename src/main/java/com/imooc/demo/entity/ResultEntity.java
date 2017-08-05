package com.imooc.demo.entity;

/**
 * Create By Bridge On 2017/8/5
 * function：ResultEntity对最外层做一个包装，返回json格式的数据，统一处理
 * @param <T>
 */
public class ResultEntity<T> {

    //返回的状态码，0，成功，1，失败
    private Integer code;

    //返回的提示信息
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCoede(Integer coede) {
        this.code = coede;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //返回的data
    private T data;
}
