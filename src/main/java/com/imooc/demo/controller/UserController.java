package com.imooc.demo.controller;

import com.alibaba.dubbo.common.json.JSONArray;
import com.alibaba.dubbo.common.json.JSONObject;
import com.imooc.demo.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Create By Bridge On 2017/8/22
 * Function:
 * Description:
 */
@Controller
public class UserController {

    /**
     * app信息的获取
     * @param request
     * @return
     */
    @GetMapping(value = "/ECharts")
    public String getAllApp(HttpServletRequest request){


        System.out.println("getAllApp");
        return "ECharts";
        //引入模板成功，但是调试的时候不能通过测试，
        // 报错：ECharts.js导入失败，
        // 查阅相关技术文档提示位置错误，多次尝试无果。
    }

    /**
     *
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/getAllECharts",method = RequestMethod.GET)
    public void getAllECharts(HttpServletRequest request,
                              HttpServletResponse response) throws Exception {
        JSONArray jsons = new JSONArray();
        List<UserEntity> lists = new ArrayList<>();
        for (UserEntity list : lists) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("user", list);
            jsons.add(jsonObject);

        }
        response.getWriter().print(jsons);
        System.out.println("response!");
    }
}
