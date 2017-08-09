package com.imooc.demo.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Create By Bridge On 2017/8/8
 * function: API 接口插件Swagger
 *
 */

@Configuration     //配置类
@EnableSwagger2   //开启Swagger2
public class Swagger2 {

    @Bean
    public Docket createResultAPI(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //指定controller存放的位置
                .apis(RequestHandlerSelectors.basePackage("com.imooc.demo"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //文档标题
                .title("DigAg")
                //描述
                .description("https://github.com/Yuicon")
                .termsOfServiceUrl("https://github.com/Yuicon")
                .version("v1")
                .build();
    }

}
