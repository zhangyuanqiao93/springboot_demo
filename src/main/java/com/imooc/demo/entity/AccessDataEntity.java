package com.imooc.demo.entity;

/**
 * Create By Bridge On 2017/8/23
 * Function: 数据对象
 * Description:
 */
public class AccessDataEntity {

    public AccessDataEntity(String date, Integer nums) {
        this.date = date;
        this.nums = nums;
    }

    private String date;
    private Integer nums;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }
}
