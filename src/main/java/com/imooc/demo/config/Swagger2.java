package com.imooc.demo.config;


import com.imooc.demo.utils.JsonResult;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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

    /*@ApiOperation(value="创建条目")
    @RequestMapping(method = RequestMethod.POST)*/
 /*   public JsonResult<Map.Entry> saveEntry(@RequestBody @ApiParam(value = "条目对象", required = true) Map.Entry entry, HttpServletRequest request) {
        //return entryService.create(entry, request);
    }*/

}
