package com.hy.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author: 何志权27629
 * @description: 项目swagger
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        // swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.hy.demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        // 构建 api文档的详细信息函数,注意这里的注解引用的是哪个
        return new ApiInfoBuilder()
                // 页面标题
                .title("mappingEtOs RESTful API")
                // 创建人
                .contact(new Contact("创建人27629", "http://www.baidu.com", ""))
                // 版本号
                .version("1.0")
                // 描述
                .description("mappingEtOs相关API")
                .build();
    }
}