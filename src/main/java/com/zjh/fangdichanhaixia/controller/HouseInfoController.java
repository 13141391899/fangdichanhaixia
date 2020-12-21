package com.zjh.fangdichanhaixia.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "houseInfo")
@RequestMapping("houseInfo")
@Slf4j
public class HouseInfoController {
  @ApiOperation("testController")
  @PostMapping("testController")
  public String testController(String value) {
    return "I am testController";
  }
}
