package com.imooc.demo.mail;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("163")
public class MailTest {

    @Autowired
    JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String sender;

    @Test
    public void sendSimpleMail(){

        SimpleMailMessage messages = new SimpleMailMessage();
        messages.setFrom(sender);
        messages.setTo(sender);
        messages.setSubject("主题： 简易邮件");
        messages.setText("邮件的主要内容");

        mailSender.send(messages);

    }

}
