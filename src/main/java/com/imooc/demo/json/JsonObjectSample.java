package com.imooc.demo.json;

import com.imooc.demo.entity.TinghuaStudent;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Create By Bridge On 2017/8/28
 * Function: JsonObjectSample
 * Description:
 */
public class JsonObjectSample {

    public static void main(String[] args) {
        JSONObjectSample();
        createJsonByMap();
        createJsonByBean();
    }

   /* {
        "name":"张丹",
            "age":20,
            "birthday":"1990-01-01",
            "school":"清华大学",
            "profession":["Computer Science","English Language"],
        "has_girlfriend":false,
            "car":null,
            "house":null,
            "comment":"这是一个注释"
    }*/

    /**
     * JSONObject 构建json对象
     */
    private static void JSONObjectSample() {
        JSONObject zd = new JSONObject();
        Object nullObject = null;
        try {
            zd.put("name","张丹");
            zd.put("age",20);
            zd.put("birthday","1990-01-01");
            zd.put("school","清华大学");
            zd.put("profession",new String[] {"Computer Science","English Language"});
            zd.put("has_girlfriend",false);
            zd.put("car",nullObject);
            zd.put("house",nullObject);
            zd.put("comment","这是一个注释");
            System.out.println("JSONObjectSample: "+zd.toString());


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * Map 方式创建json对象
     */
    private static void createJsonByMap(){
        Map<String,Object>  zd = new HashMap<>();
        Object nullObject = null;
            zd.put("name","张丹");
            zd.put("age",20);
            zd.put("birthday","1990-01-01");
            zd.put("school","清华大学");
            zd.put("profession",new String[] {"Computer Science","English Language"});
            zd.put("has_girlfriend",false);
            zd.put("car",nullObject);
            zd.put("house",nullObject);
            zd.put("comment","这是一个注释");
            System.out.println("createJsonByMap: "+new JSONObject(zd).toString());//JSONObject的构造函数

    }

    /**
     * 通过java bean的方式构建json对象
     */
    private static void createJsonByBean(){

        TinghuaStudent stu = new TinghuaStudent();
        stu.setName("张丹");
        stu.setAge(20);
        stu.setBirthday("1990-01-01");
        stu.setSchool("清华大学");
        stu.setProfession(new String[] {"Computer Science","English Language"});
        stu.setCar(null);
        stu.setHouse(null);
        stu.setHas_girlfriend(true);
        stu.setComment("这是一个注解");

        System.out.println("createJsonByBean: "+new JSONObject(stu));

    }


}
