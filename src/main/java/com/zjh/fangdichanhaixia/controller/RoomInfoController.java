package com.zjh.fangdichanhaixia.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjh.fangdichanhaixia.enums.EnumInterface;
import com.zjh.fangdichanhaixia.pojo.BossInfoDO;
import com.zjh.fangdichanhaixia.pojo.OplogInfoDO;
import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import com.zjh.fangdichanhaixia.service.OpLogInfoService;
import com.zjh.fangdichanhaixia.service.RoomInfoService;
import com.zjh.fangdichanhaixia.utils.PageList;
import com.zjh.fangdichanhaixia.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@Api(value = "房间信息Controller", tags = "房间信息Controller")
@RequestMapping("roomInfo")
@Slf4j
@Transactional
public class RoomInfoController {
  @Autowired
  RoomInfoService roomInfoService;
  @Autowired
  OpLogInfoService opLogInfoService;

  @ApiOperation("新增房间信息")
  @PostMapping("add")
  public Result<String> add(@RequestBody RoomInfoDO roomInfoDO) {
    log.info("新增房间信息 入参={}", JSONObject.toJSONString(roomInfoDO));

    Result<String> result = new Result().failure("新增房间信息 失败", "新增房间信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      } if (null != roomInfoDO.getContracTimeArr()) {
        roomInfoDO.setContractStartTime(roomInfoDO.getContracTimeArr()[0]);
        roomInfoDO.setContractEndTime(roomInfoDO.getContracTimeArr()[1]);
      }
      roomInfoDO.setCreatorName("王海霞");
      roomInfoDO.setUpdatorName("王海霞");
      roomInfoService.add(roomInfoDO);
      opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.ADD_ROOM.getCode()).contentNew(JSONObject.toJSONString(roomInfoDO)).contentOld(null).build());
      result = new Result().success("新增房间信息 成功", "新增房间信息 成功");
      log.info("新增房间信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("新增房间信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("批量删除房间信息")
  @PostMapping("deleteBatch")
  public Result<String> deleteBatch(@RequestBody List<Integer> roomIds) {
    log.info("批量删除房间信息 入参={}", JSONObject.toJSONString(roomIds));

    Result<String> result = new Result().failure("批量删除房间信息 失败", "批量删除房间信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      roomInfoService.deleteBatch(roomIds);
      opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.DELETE_ROOM.getCode()).contentNew(JSONObject.toJSONString(roomIds)).contentOld(null).build());
      result = new Result().success("批量删除房间信息 成功", "批量删除房间信息 成功");
      log.info("批量删除房间信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("批量删除房间信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("修改房间信息")
  @PostMapping("update")
  public Result<String> update(@RequestBody RoomInfoDO roomInfoDO) {
    log.info("修改房间信息 入参={}", JSONObject.toJSONString(roomInfoDO));

    Result<String> result = new Result().failure("修改房间信息 失败", "修改房间信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      if (null != roomInfoDO.getContracTimeArr()) {
        roomInfoDO.setContractStartTime(roomInfoDO.getContracTimeArr()[0]);
        roomInfoDO.setContractEndTime(roomInfoDO.getContracTimeArr()[1]);
      }
      RoomInfoDO roomInfoDOOld = roomInfoService.selectById(roomInfoDO.getId());
      roomInfoService.update(roomInfoDO);
      opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.UPDATE_BOSS.getCode()).contentNew(JSONObject.toJSONString(roomInfoDO)).contentOld(JSONObject.toJSONString(roomInfoDOOld)).build());
      result = new Result().success("修改房间信息 成功", "修改房间信息 成功");
      log.info("修改房间信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("修改房间信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("单个查询房间信息")
  @PostMapping("selectById")
  public Result<RoomInfoDO> selectById(@RequestBody Integer payId) {
    log.info("单个查询房间信息 入参={}", payId);

    Result<RoomInfoDO> result = new Result().failure("单个查询房间信息 失败", "单个查询房间信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      RoomInfoDO roomInfoDO = roomInfoService.selectById(payId);
      result = new Result().success(roomInfoDO, "单个查询房间信息 成功");
      log.info("单个查询房间信息 出参={}", JSONObject.toJSONString(result));
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("单个查询房间信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("分页查询房间信息")
  @PostMapping("selectByPage")
  public Result<PageList<RoomInfoDO>> selectByPage(@RequestBody RoomInfoDO roomInfoDO) {
    log.info("分页查询房间信息 入参={}", JSONObject.toJSONString(roomInfoDO));

    Result<PageList<RoomInfoDO>> result = new Result().failure("分页查询房间信息 失败", "分页查询房间信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      if (null != roomInfoDO.getContracTimeArr()) {
        roomInfoDO.setContractStartTime(roomInfoDO.getContracTimeArr()[0]);
        roomInfoDO.setContractEndTime(roomInfoDO.getContracTimeArr()[1]);
      }
      PageList<RoomInfoDO> pageList = roomInfoService.selectByPage(roomInfoDO);
      result = new Result().success(pageList, "分页查询房间信息 成功");
      log.info("分页查询房间信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("分页查询房间信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }
}
