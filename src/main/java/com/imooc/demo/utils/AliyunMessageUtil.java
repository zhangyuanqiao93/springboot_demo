package com.imooc.demo.utils;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import java.util.Map;

/**
 * Create By Bridge On 2017/8/23
 * Function: AliyunMessageUtil
 * Description: 阿里云短信验证服务
 */
public class AliyunMessageUtil {
    //throws com.aliyuncs.exceptions.ClientException {


    //初始化ascClient需要的几个参数
    private final static String product = "Dysmsapi";
    //产品域名，开发者无需要替换即可使用
    private final static String domain = "dysmsapi.aliyuncs.com";

    // 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    private final static String AccessKeyID  = "AccessKeyID";
    private final static String AccessKeySecret  = "AccessKeySecret";//不要出现空格


    public static SendSmsResponse sendSmsResponse(Map<String,String> paramMap) throws ClientException {
        //设置超时时间-可自行调整
        System.setProperty("sun.net.client.defaultConnectTimeout", "60000");
        System.setProperty("sun.net.client.defaultReadTimeout", "60000");

        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", AccessKeyID,AccessKeySecret);
        DefaultProfile.addEndpoint("cn-hangzhou","cn-hangzhou",product,domain);
        IAcsClient iAcsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //待发送的手机号，必填！
        request.setPhoneNumbers(paramMap.get("phoneNumber"));
        //必填:短信签名-可在短信控制台中找到
        request.setSignName(paramMap.get("msgSign"));
        //短信模板必填：templateCode
        request.setTemplateCode(paramMap.get("templateCode"));

        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        request.setTemplateParam(paramMap.get("jsonContent"));
        //选填-上行短信扩展码(无特殊需求用户请忽略此字段)
        //request.setSmsUpExtendCode(paramMap.get("extendCode"))
        //可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        //request.setOutId(paramMap.get("outId"));
        //可能会排出异常
        SendSmsResponse sendSmsResponse = null;
        try{
             sendSmsResponse = iAcsClient.getAcsResponse(request);
        }catch (Exception e){
            e.printStackTrace();
        }
        return sendSmsResponse;
    }

    /**
     * 生成6位数随机码
     * @param num
     * @return
     */
    public static String createRandomNum(int num) {
        String randomNumStr = "";
        for(int i = 0; i < num;i ++){
            int randomNum = (int)(Math.random() * 10);
            randomNumStr += randomNum;
        }
        return randomNumStr;
    }
}
