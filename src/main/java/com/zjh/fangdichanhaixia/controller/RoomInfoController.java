package com.zjh.fangdichanhaixia.controller;

import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import com.zjh.fangdichanhaixia.service.RoomInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "roomInfo")
@RequestMapping("roomInfo")
@Slf4j
public class RoomInfoController {

  @Autowired
  RoomInfoService roomInfoService;
  @ApiOperation("getAllRoomInfo")
  @PostMapping("getAllRoomInfo")
  public List<RoomInfoDO> testController(String value) {
    return roomInfoService.getAllRoomInfo();
  }
}
