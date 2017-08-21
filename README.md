# Bridge搭建的第一个Spring Boot项目 + Spring Data 详解

## 第一个spring boot Demo  + Spring Data 详解

附上Spring Boot 的官方网址[Spring Boot](http://projects.spring.io/spring-boot/)
以及慕课网的教程地址：[慕课网](http://www.imooc.com) &&
[玩转 Spring Data ](http://www.imooc.com/learn/821)

之前接触过spring boot，但是JAVA的基础不是很牢固，后来只要研究前端的一些东西，现在自己研究一下spring boot的配置，代码实现等。个人是在慕课网教学视频，有兴趣的可以去参考一下聊师兄的教程。讲解的还不错，形象生动，哈哈。

**代码主要包含：**

1.用IDEA 搭建Spring Boot开发环境

2.运行第一个Spring Boot程序 Hello Spring Boot!

3.在Spring Boot中的关于注解的使用方法

4..properties和.yml文件的配置(修改运行端口，配置mysql数据库连接，以及建立实体，在数据库中自动创建数据库以及表等) 

5.关于使用templates模板展示HTML效果

6.事务处理(已经更新代码)

7.spring boot的总结和学习经验交流(待更新)

8.**新增**Spring Data对于事务处理，数据库访问，业务逻辑处理，以及对于Spring Data 核心接口Repository的学习和应用

9.新增Spring Boot 集成Java Mail的实例的五种发送方式

--------------------------------------------

# Spring Data 核心接口——Repository

## Spring Data 中的Repository

  1.在repository的方法中使用，不需要遵循查询命名规则；
  2.只需要将@Query注解注解在repository的方法撒花姑娘即可；
  3.命名参数以及索引参数的使用
  4.本地查询
 
# Spring Data 学习大纲和总结
1.使用传统方法访问数据库和Spring Data方法访问数据库作对比，更加方便快捷，代码量少，配置少；

2.Spring Data 开发环境的搭建(对于beans.xml以及beans-new.xml的配置)

3.Spring Data Jpa接口的实例(包含@Query注解的使用，以及更新事务整合等操作)

4.Spring Data 核心接口Repository的详解

5.个人学习总结 Spring Data

# 在学习Spring Boot过程掉过的坑

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
    
    
3.java mail的坑

javax.mail.AuthenticationFailedException: 550 User has no permission 

## ------****解决方案****-------

将163邮箱或者qq邮箱的POP3、SMTP和IMAP协议等，开通方法，可以百度或者google，这里提供一个参考来源：
[163 POP3、SMTP和IMAP开通](http://jingyan.baidu.com/article/7c6fb42838607480642c9002.html),即可发送邮箱成功。
 
4.在配置Spring Data的@Query注解时，遇到如下问题：

参数绑定失败。

```
//@Query("update EmployeeEntity emp set age= :age where emp.id = :id")
public void updateAgeById(@Param("id") Integer id, @Param("age") Integer age);
```
## ------****解决方案****-------

目前具体不知什么原因，所以没有想到解决方案。视频教程倒是可以用以上代码的方法，但是在开发的实际过程中，只能通过以下方式实现，但是不影响整个项目的运行，所有的方法类等都是有测试代码一个方法一个类的严格的测试。
```
    @Modifying
    @Transactional//添加事务注解
    @Query("update EmployeeEntity emp set age= ?2 where emp.id = ?1")
    //@Query("update EmployeeEntity emp set age= :age where emp.id = :id")
    public void updateAgeById(@Param("id") Integer id, @Param("age") Integer age);
    

```

5.在搭建spring data 的环境时，遇到的坑
```
<context:component-scan base-package="com.imooc.demo.service"/>
```
 ***
 指定扫描包的时候一定要指定到service包中，不然会报错，且错误是不可预见。
 ***
   