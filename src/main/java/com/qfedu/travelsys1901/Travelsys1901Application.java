package com.qfedu.travelsys1901;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.qfedu.travelsys1901.dao")
@EnableSwagger2
public class Travelsys1901Application {

    public static void main(String[] args) {
        SpringApplication.run(Travelsys1901Application.class, args);
    }
}
