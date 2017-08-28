package com.imooc.demo.json;


import org.apache.commons.io.FileUtils;
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
         */
        String path = "/zd.json";
        File file = new File(ReadJSONSample.class.getResource(path).getFile());
        String content = FileUtils.readFileToString(file,"UTF-8");
        JSONObject jsonObject = new JSONObject(content);
        System.out.println("姓名是： "+ jsonObject.getString("name"));
    }
}
