package com.imooc.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * Create By Bridge On 2017/8/11
 * Function:
 * Description:
 */

@Mapper
public interface GirlMapper {

    @Select("select * from girl_entity;")
    public Map<String,Object> find();

    @Insert("insert into girl_entity(openid,status,nickname,sex,city,province,country,headimgurl,subscribe_time) "+
            "values(#{id},1,'nick',1,'city','provi','contr','img',now())")
    public int insert(@Param("id")int id);
}
