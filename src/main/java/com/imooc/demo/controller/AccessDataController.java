package com.imooc.demo.controller;

import com.github.abel533.echarts.Option;
import com.imooc.demo.entity.AccessDataEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Create By Bridge On 2017/8/23
 * Function:
 * Description:
 */
public class AccessDataController {

    /**
     * 模拟从数据库获取数据
     * @return list
     */
    public List<AccessDataEntity> getWeekData(){
        List<AccessDataEntity> list = new ArrayList<>(7);
        list.add(new AccessDataEntity("08-16", 4));
        list.add(new AccessDataEntity("08-17", 7));
        list.add(new AccessDataEntity("08-18", 14));
        list.add(new AccessDataEntity("08-19", 304));
        list.add(new AccessDataEntity("08-20", 66));
        list.add(new AccessDataEntity("08-21", 16));
        list.add(new AccessDataEntity("08-22", 205));

        return list;
    }
    //获取数据
    List<AccessDataEntity> datas = getWeekData();
    Option option = new Option();
    

}
