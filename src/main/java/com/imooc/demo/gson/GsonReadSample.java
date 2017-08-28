package com.imooc.demo.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imooc.demo.entity.Student;
import com.imooc.demo.entity.StudentWithBirthDay;
import com.imooc.demo.json.ReadJSONSample;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Create By Bridge On 2017/8/28
 * Function: GsonReadSample
 * Description:
 */
public class GsonReadSample {

    public static void main(String[] args) throws IOException {
        String path = "/Student.json";

        //绝对路径，无效url
        // String path1 = "D:/Development/code/springboot_demo/src/main/java/com/imooc/demo/json/Student.json";
        File file = new File(ReadJSONSample.class.getResource(path).getFile());//读取文件
        String content = FileUtils.readFileToString(file,"UTF-8");

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

        /**
         * 接口不能被实例化
         */
        StudentWithBirthDay student = gson.fromJson(content,StudentWithBirthDay.class);
        //System.out.println(student.getBirthday().toString());
        System.out.println(student.getProfession());
        System.out.println(student.getProfession().getClass());


        Gson gson1 = new Gson();
        Student student1 = gson1.fromJson(content, Student.class);
        //System.out.println(student1);

    }
}
