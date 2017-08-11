package com.imooc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication：核心注解，组合注解，@ComponentScan，@EnableAutoConfiguration以及@Configuration的组合注解，
// 可以参考@SpringBootApplication源码
@SpringBootApplication
public class GirlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GirlApplication.class, args);
	}

	/**
	 *  启动项目时的字符串默认图案修改
	 *  URL：http://patorjk.com/software/taag/
	 *  1.在src/main/resources下新建一个banner.txt；
	 *  2.将从以上网址生产的字符串，如"My Spring Boot"，然后将其复制到banner.txt中，启动项目即可。
	 */

}


