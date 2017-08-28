package com.imooc.demo.controller;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.imooc.demo.utils.AliyunMessageUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Create By Bridge On 2017/8/23
 * Function: AliYun短信验证服务
 * Description:
 */

@Controller
public class MsgDemoController {
/*
    public static void main(String[] args) {
        MsgDemoController msgDemo = new MsgDemoController();
        try {
            try {
                msgDemo.sendMsg();
                System.out.println("验证码发送成功！");
            } catch (com.aliyuncs.exceptions.ClientException e) {
                e.printStackTrace();
            }
            System.out.println("验证码发送失败！");
        } catch (ClientException e) {
            System.out.println("验证码发送失败！");
        }
    }
*/



    @RequestMapping(value = "/sendMsg",method = RequestMethod.POST)
    public void sendMsg() throws com.aliyuncs.exceptions.ClientException {

        String phoneNumber = "***********";
        String randomNum  = AliyunMessageUtil.createRandomNum(6);//生成6位随机验证码

        String jsonContent = "{\"number\":\"" + randomNum + "\"}";
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("phoneNumber",phoneNumber);
        paramMap.put("msgSign","桥先森");
        paramMap.put("templateCode","SMS_88370003");
        paramMap.put("jsonContent",jsonContent);

        SendSmsResponse sendSmsResponse = AliyunMessageUtil.sendSmsResponse(paramMap);
        if (!(sendSmsResponse.getCode()!=null &&sendSmsResponse.getCode().equals("OK"))){
            if (sendSmsResponse.getCode() == null){
                //这里可以抛出做决定以的异常
                System.out.println("验证码发送失败");
            } else if(!sendSmsResponse.getCode().equals("OK")) {
                //这里可以抛出自定义异常
                System.out.println("验证码发送失败！");
            }
        }
        System.out.println("验证码发送成功！");
    }
}
