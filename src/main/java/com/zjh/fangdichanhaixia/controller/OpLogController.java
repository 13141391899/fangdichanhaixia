package com.zjh.fangdichanhaixia.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjh.fangdichanhaixia.pojo.OplogInfoDO;
import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import com.zjh.fangdichanhaixia.service.OpLogInfoService;
import com.zjh.fangdichanhaixia.utils.PageList;
import com.zjh.fangdichanhaixia.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "操作日志信息Controller", tags = "操作日志信息Controller")
@RequestMapping("opLogInfo")
@Slf4j
public class OpLogController {
  @Autowired
  OpLogInfoService opLogInfoService;

  @ApiOperation("新增操作日志信息")
  @PostMapping("add")
  public Result<String> add(@RequestBody OplogInfoDO oplogInfoDO) {
    log.info("新增操作日志信息 入参={}", JSONObject.toJSONString(oplogInfoDO));

    Result<String> result = new Result().failure("新增操作日志信息 失败", "新增操作日志信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      oplogInfoDO.setCreatorName("王海霞");
      opLogInfoService.add(oplogInfoDO);
      result = new Result().success("新增操作日志信息 成功", "新增操作日志信息 成功");
      log.info("新增操作日志信息 出参={}", JSONObject.toJSONString(result));
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("新增操作日志信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("分页查询操作日志信息")
  @PostMapping("selectByPage")
  public Result<PageList<RoomInfoDO>> selectByPage(@RequestBody OplogInfoDO oplogInfoDO) {
    log.info("分页查询操作日志信息 入参={}", JSONObject.toJSONString(oplogInfoDO));

    Result<PageList<RoomInfoDO>> result = new Result().failure("分页查询操作日志信息 失败", "分页查询操作日志信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      PageList<OplogInfoDO> pageList = opLogInfoService.selectByPage(oplogInfoDO);
      result = new Result().success(pageList, "分页查询操作日志信息 成功");
      log.info("分页查询操作日志信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("分页查询操作日志信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }
}
