package com.qfedu.travelsys1901.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    public ApiInfo createA(){
        ApiInfo info=new ApiInfoBuilder().title("旅社数据接口").
                contact( new Contact("Java1901","http://1000phone.com","2687518378@qq.com")).
                description("数据接口信息").build();
        return info;
    }
    @Bean
    public Docket createDocket(){
        Docket docket=new Docket(DocumentationType.SWAGGER_2).apiInfo(createA()).select().
                apis(RequestHandlerSelectors.basePackage("com.qfedu.travelsys1901.controller")).build();
        return docket;

    }

}
