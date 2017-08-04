package com.imooc.demo.controller;

import com.imooc.demo.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//@Controller
//@ResponseBody
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;


   /* @Value("${cupSize}") //通过@Value注解，将配置文件的内容注入到其中。
    private String cupSize;
    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;*/

    //获取URL中的数据: @PathVariable("id") Integer id
    //
//    @RequestMapping(value = {"/say"},method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") Integer myId){
        return "id: " + myId;
//        return "Hello Spring Boot!";
//        return cupSize + " and  "+ age;
//        return content;
//        return girlProperties.getCupSize();
//        return "index";
    }


}
