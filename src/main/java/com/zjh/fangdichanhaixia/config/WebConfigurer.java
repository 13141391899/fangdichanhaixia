package com.zjh.fangdichanhaixia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfigurer implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
      .allowedOriginPatterns("*")
      .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
      .allowedHeaders()
      .allowedHeaders("*")
      .allowCredentials(true);
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/**").addResourceLocations(
      "classpath:/static/");
    registry.addResourceHandler("swagger-ui.html").addResourceLocations(
      "classpath:/META-INF/resources/");
    registry.addResourceHandler("/webjars/**").addResourceLocations(
      "classpath:/META-INF/resources/webjars/");
    WebMvcConfigurer.super.addResourceHandlers(registry);
  }

}
