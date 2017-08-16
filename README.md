# 个人搭建的第一个Spring Boot项目Demo

## 我的第一个spring boot Demo

附上Spring Boot 的官方网址[Spring Boot](http://projects.spring.io/spring-boot/)
以及慕课网的教程视频地址[慕课网](http://www.imooc.com)


之前接触过spring boot，但是JAVA的基础不是很牢固，后来只要研究前端的一些东西，现在自己研究一下spring boot的配置，代码实现等。个人是在慕课网教学视频，有兴趣的可以去参考一下聊师兄的教程。讲解的还不错，形象生动，哈哈。

**代码主要包含：**

1.用IDEA 搭建Spring Boot开发环境

2.运行第一个Spring Boot程序 Hello Spring Boot!

3.在Spring Boot中的关于注解的使用方法

4..properties和.yml文件的配置(修改运行端口，配置mysql数据库连接，以及建立实体，在数据库中自动创建数据库以及表等) 

5.关于使用templates模板展示HTML效果

6.事务处理(已经更新代码)

7.spring boot的总结和学习经验交流(待更新)

## 在学习Spring Boot 过程中的拦路虎

1. 配置mysql数据库时出现警告：
WARN: Establishing SSL connection without server's identity verification is not recommended. 

解决方案：在其url中添加如下语句：
```
url: jdbc:mysql://127.0.0.1:3306/dbgirl?characterEncoding=utf8&useSSL=false

```
```
datasource:
        driver-class-name: com.mysql.jdbc.Driver
        url: jdbc:mysql://127.0.0.1:3306/dbgirl?characterEncoding=utf8&useSSL=false
```

    datasource:
        driver-class-name: com.mysql.jdbc.Driver
        url: jdbc:mysql://127.0.0.1:3306/dbgirl?characterEncoding=utf8&useSSL=false
添加缘由：在spring boot项目中，默认的数据库编码格式是UTF-8，而在mysql数据库中默认的编码格式是GBK。

- 向数据库村数据时， 数据库在存放项目数据的时候会先用UTF-8格式将数据解码成字节码，然后再将解码后的字节码重新使用GBK编码存放到数据库中。
- 从mysql数据库中取出数据时，  在从数据库中取数据的时候，数据库会先将数据库中的数据按GBK格式解码成字节码，然后再将解码后的字节码重新按UTF-8格式编码数据，最后再将数据返回给客户端。

传送门：[mysql 连接url中useUnicode=true&characterEncoding=UTF-8 的作用](http://www.cnblogs.com/xuefuwu/archive/2012/05/06/2486577.html)

2.MarkDown 学习入门指南[简书——MarkDown入门指南](http://www.jianshu.com/p/1e402922ee32/)    ，[Markdown 语法说明 (简体中文版)](http://www.appinn.com/markdown/)   
    
    
###  java mail的坑

javax.mail.AuthenticationFailedException: 550 User has no permission    