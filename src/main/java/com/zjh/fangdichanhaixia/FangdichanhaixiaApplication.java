package com.zjh.fangdichanhaixia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication(scanBasePackages={"com.zjh.fangdichanhaixia"})
@EnableSwagger2
@MapperScan(basePackages = "com.zjh.fangdichanhaixia.mapper")
public class FangdichanhaixiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FangdichanhaixiaApplication.class, args);
    }

}
