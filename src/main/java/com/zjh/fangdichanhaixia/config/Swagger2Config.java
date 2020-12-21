package com.zjh.fangdichanhaixia.config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@Slf4j
public class Swagger2Config {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("fangdichanhaixia-main")
				.enable(true)
				.select()
				//通过指定扫描包暴露接口
				.apis(RequestHandlerSelectors.basePackage("com.zjh.fangdichanhaixia.controller"))
				//设置过滤规则暴露接口
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Api")
				.description("王海霞同志的房地产项目API")
				.version("1.0")
				.termsOfServiceUrl("")
				.license("")
				.licenseUrl("")
				.build();
	}
}
