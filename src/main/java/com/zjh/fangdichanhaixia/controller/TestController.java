package com.zjh.fangdichanhaixia.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "testController")
public class TestController {

  @ApiOperation("testController")
  @PostMapping("testController")
  public String testController(String value) {
    return "I am testController";
  }
}
