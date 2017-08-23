package com.imooc.demo.controller;

import com.alibaba.dubbo.common.json.JSONArray;
import com.alibaba.dubbo.common.json.JSONObject;
import com.imooc.demo.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Create By Bridge On 2017/8/22
 * Function:
 * Description:
 */
@RestController//@RestController + @ResponseBody
public class UserController {

    /**
     * app信息的获取
     * @param request
     * @return
     */
    @GetMapping(value = "/e-charts")
    public String getAllApp(HttpServletRequest request){
        //request.setAttribute("appList",appManager.getAllApp());
//        return "sys/app/list";
        System.out.println("getAllApp");
        return "ECharts";
    }

    /**
     *
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value = "/getAllECharts")
    public void getAllECharts(HttpServletRequest request,
                              HttpServletResponse response) throws Exception {
        /*List list = new ArrayList();
        JSONArray jsons = new JSONArray();
        for (int i = 0; i < 10; i++) {
            UserEntity user = new UserEntity();
            user.setName("name" + i);
            user.setId(i);
            list.add(user);
        }


        for (int j = 0; j < list.size(); j++) {

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("user",list.get(j));
            jsons.add(jsonObject);
        }
        response.getWriter().print(jsons);*/
        JSONArray jsons = new JSONArray();
        List<UserEntity> lists = new ArrayList<>();
        for (UserEntity list : lists) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("user", list);
            jsons.add(jsonObject);

        }
        response.getWriter().print(jsons);
    }
}
