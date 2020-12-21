package com.zjh.fangdichanhaixia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication(scanBasePackages={"com.zjh.fangdichanhaixia"})
@EnableSwagger2
public class FangdichanhaixiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FangdichanhaixiaApplication.class, args);
    }

}
