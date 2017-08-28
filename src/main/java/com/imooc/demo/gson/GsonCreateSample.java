package com.imooc.demo.gson;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imooc.demo.entity.Student;

import java.lang.reflect.Field;

/**
 * Create By Bridge On 2017/8/28
 * Function: GsonCreateSample,使用gson创建一个json
 * Description:
 */
public class GsonCreateSample {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张丹");
        stu.setAge(20);
        stu.setBirthday("1990-01-01");
        stu.setSchool("清华大学");
        stu.setProfession(new String[] {"Computer Science","English Language"});
        stu.setCar(null);
        stu.setHouse(null);
        stu.setHas_girlfriend(true);
        stu.setComment("这是一个注解");
        stu.setIgnore("看不见我！");


        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
            @Override
            public String translateName(Field field) {
                if (field.getName().equals("name")){
                    return "NAME";
                }
                return field.getName();
            }
        });
        Gson gson = gsonBuilder.create();//gsonBuilder创建一个对象
//        Gson gson = new Gson();//使用GSON构建JSON
        System.out.println(gson.toJson(stu));
    }
}
