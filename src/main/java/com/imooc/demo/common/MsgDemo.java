package com.imooc.demo.common;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.imooc.demo.utils.AliyunMessageUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Create By Bridge On 2017/8/23
 * Function: AliYun短信验证服务
 * Description:
 */
public class MsgDemo {

    public static void main(String[] args) {
       /* MsgDemo msgDemo = new MsgDemo();
        try {
            msgDemo.sendMsg();
            System.out.println("验证码发送成功！");
        } catch (ClientException e) {
            System.out.println("验证码发送失败！");
        }*/
    }

    public void sendMsg() throws com.aliyuncs.exceptions.ClientException {

        String phoneNumber = "18888888888";
        String randomNum  = createRandomNum(6);
        String jsonContent = "{\"number\":\"" + randomNum + "\"}";
        Map<String,String> paramMap = new HashMap<>();
        paramMap.put("phoneNumber",phoneNumber);
        paramMap.put("msgSign","Bridge");
        paramMap.put("templateCode","你的短信模板码");
        paramMap.put("jsonContent",jsonContent);

        SendSmsResponse sendSmsResponse = AliyunMessageUtil.sendSmsResponse(paramMap);
        if (!(sendSmsResponse.getCode()!=null &&sendSmsResponse.getCode().equals("OK"))){
            if (sendSmsResponse.getCode() == null){
                //这里可以抛出做决定以的异常

            } else if(!sendSmsResponse.getCode().equals("OK")) {
                //这里可以抛出自定义异常
            }
        }
    }

    /**
     * 生成6位数随机码
     * @param num
     * @return
     */
    private static String createRandomNum(int num) {
        String randomNumStr = "";
        for(int i = 0; i < num;i ++){
            int randomNum = (int)(Math.random() * 10);
            randomNumStr += randomNum;
        }
        return randomNumStr;
    }
}
