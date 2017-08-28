package com.imooc.demo.json;


import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;

/**
 * Create By Bridge On 2017/8/28
 * Function: ReadJSONSample
 * Description: 从一个文件中读取一个json
 *
 */
public class ReadJSONSample {

    public ReadJSONSample() {
    }

    public static void main(String[] args) throws IOException, JSONException {

        /**
         * 获取json文件
         *
         * 注意，此处会报空指针异常，将.json文件放置在target-->classes根目录下即可。具体原因未知。
         *
         * 实体名字一定要和json返回的键值相同，否则就会空指针异常。
         */
        String path = "/TinghuaStudent.json";

        //绝对路径，无效url
        // String path1 = "D:/Development/code/springboot_demo/src/main/java/com/imooc/demo/json/Student.json";
        File file = new File(ReadJSONSample.class.getResource(path).getFile());//读取文件
        String content = FileUtils.readFileToString(file,"UTF-8");
        JSONObject jsonObject = new JSONObject(content);

        if (!jsonObject.isNull("name")){
            System.out.println("姓名是： "+ jsonObject.getString("name"));
        }
        System.out.println("年龄是： "+ jsonObject.getString("age"));
        System.out.println("学校是： "+ jsonObject.getString("school"));
        System.out.println("是否有对象： "+ jsonObject.getBoolean("has_girlfriend"));

        /**
         * 通过JSONArray解析JSON
         */
        JSONArray profession = jsonObject.getJSONArray("profession");
        for (int i = 0; i < profession.length(); i++) {
            String prof = (String) profession.get(i);
            System.out.println("专业-"+ (i+1)+" : "+ prof);
        }

    }
}
