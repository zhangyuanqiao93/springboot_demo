package com.imooc.demo.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *  Create By Bridge On 2017/8/9
 * Swagger测试类
 *
 */

@Controller
@RequestMapping("/api/demo1")
public class Swagger1DemoController {

    @ResponseBody//这里指定RequestMethod，如果不指定Swagger会把所有RequestMethod都输出，// 在实际应用中，具体指定请求类型也使接口更为严谨。
    @RequestMapping(value = "/show",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "测试接口",notes = "测试接口详细描述")
    public String show(
            @ApiParam(required = true,name = "name",value = "姓名")
                    @RequestParam(name = "name",required = true)
            String name){
        return "success";
    }

}