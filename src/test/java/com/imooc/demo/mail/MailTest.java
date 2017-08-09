package com.imooc.demo.mail;


import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * Create By Bridge On 2017/8/9
 *
 * function： Java发送mail，集成在spring boot中的开发
 *
 * java发送邮件的四种形式
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("163") //@ActiveProfiles：指定163邮箱
public class MailTest {

    private static Logger logger = LoggerFactory.getLogger(MailTest.class);

    @Autowired
    JavaMailSender mailSender;

    @Value("${spring.mail.username}")//邮件接收人
    private String sender;

    /**
     * 发送普通的邮件
     */
    @Test
    public void sendSimpleMail(){

        SimpleMailMessage messages = new SimpleMailMessage();
        messages.setFrom(sender);
        messages.setTo(sender);
        messages.setSubject("主题： Bridge的第一封Java邮件");
        messages.setText("Hello Bridge！");
        logger.info("Success：普通 格式的邮件发送成功了。");
        mailSender.send(messages);

    }

    /**
     * 发送HTML的邮件代码
     */

    @Test
    public void sendHtmlMail(){

        MimeMessage mimeMessage = null;

        mimeMessage = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
            helper.setFrom(sender);
            helper.setTo(sender);
            helper.setSubject("标题： 发送Html内容");

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("<h1>我的第一封HTML邮件</h1>")
                    .append("<p style='color:#f00'>红色字体</p>")
                    .append("<p style='text-align:right'>右对齐</P>");
            helper.setText(stringBuffer.toString(),true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        logger.info("Success：Html 格式的邮件发送成功了。");
        mailSender.send(mimeMessage);
    }

    /**
     * 发送带附件的邮件
     *
     */

    @Test
    public void sendAttachment(){
        MimeMessage mimeMessage = null;

        try {
            mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
            helper.setFrom(sender);
            helper.setTo(sender);
            helper.setSubject("主题：带附件的java mail");
            helper.setText("带附件的邮件内容。");

            //提交附件的位置
            FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/image/picture.jpg"));
            helper.addAttachment("图片.jpg",file);

        }catch (Exception e){
            e.printStackTrace();
        }
        //发送e-mail
        logger.info("Success：带附件的 格式的邮件发送成功了。");
        //System.out.println("带附件的邮件发送成功了。");
        mailSender.send(mimeMessage);
    }


    /**
     * 发送带静态资源的mail
     *
     */

    @Test
    public void sendInlineMail() {

        MimeMessage message = null;

        try {
            message = mailSender.createMimeMessage();//否则message always null;
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom(sender);
            helper.setTo(sender);
            helper.setSubject("主题:带静态资源的邮件。");
            //第二个参数指定的是发送的是HTML格斯，同时cid：固定写法
            //记得指定html:true,setText传递两个参数
            helper.setText("<html><body> 带静态资源的邮件内容 图片：<img src='cid:picture' /> </body></html>",true);
            FileSystemResource file = new FileSystemResource(new File("src/main/resources/static/image/picture.jpg"));
            helper.addInline("picture",file);

        } catch (MessagingException e) {
            e.printStackTrace();
        }

        //
        logger.info("success： 发送带静态资源的邮件成功。");
        mailSender.send(message);
    }

    /**
     *  java mail 发送
     */

    @Autowired
    private FreeMarkerConfigurer configurer;  //自动注入

    @Test
    public void sendTemplateMail() throws IOException {
        MimeMessage mimeMessage = null;

        mimeMessage = mailSender.createMimeMessage();

        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(sender);
            mimeMessageHelper.setSubject("邮件主题：邮件模板。");
//            mimeMessageHelper.setText("");

            Map<String,Object> map = new HashMap<>();

            map.put("username","Bridge");
            //修改 application.properties 文件中的读取路径
            //读取HTML模板
            freemarker.template.Template template = configurer.getConfiguration().getTemplate("mail.html");

            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);
            mimeMessageHelper.setText(html,true);
        } catch (MessagingException | TemplateException e) {
            e.printStackTrace();
        }
        mailSender.send(mimeMessage);
    }
}
