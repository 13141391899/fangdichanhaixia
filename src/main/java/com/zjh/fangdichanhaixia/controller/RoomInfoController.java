package com.zjh.fangdichanhaixia.controller;

import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import com.zjh.fangdichanhaixia.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "房间信息Controller",tags = "房间信息Controller")
@RequestMapping("roomInfo")
@Slf4j
public class RoomInfoController {
  @ApiOperation("新增房间信息")
  @PostMapping("add")
  public Result<String> add(@RequestBody RoomInfoDO roomInfoDO) {
    Result<String> result = new Result().failure("新增房间信息 失败", "新增房间信息 失败");
    try {
      if (1 > 1) {
        result.setMsg("我是错误提示语");
        return result;
      }
      return new Result().success("新增房间信息 成功", "新增房间信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMsg(e.getMessage());
      return result;
    }
  }

  @ApiOperation("批量删除房间信息")
  @PostMapping("deleteBatch")
  public Result<String> deleteBatch(@RequestBody List<Integer> payIds) {
    Result<String> result = new Result().failure("批量删除房间信息 失败", "批量删除房间信息 失败");
    try {
      if (1 > 1) {
        result.setMsg("我是错误提示语");
        return result;
      }
      return new Result().success("批量删除房间信息 成功", "批量删除房间信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMsg(e.getMessage());
      return result;
    }
  }

  @ApiOperation("修改房间信息")
  @PostMapping("update")
  public Result<String> update(@RequestBody RoomInfoDO roomInfoDO) {
    Result<String> result = new Result().failure("修改房间信息 失败", "修改房间信息 失败");
    try {
      if (1 > 1) {
        result.setMsg("我是错误提示语");
        return result;
      }
      return new Result().success("修改房间信息 成功", "修改房间信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMsg(e.getMessage());
      return result;
    }
  }

  @ApiOperation("单个查询房间信息")
  @PostMapping("selectById")
  public Result<String> selectById(@RequestBody Integer payId) {
    Result<String> result = new Result().failure("单个查询房间信息 失败", "单个查询房间信息 失败");
    try {
      if (1 > 1) {
        result.setMsg("我是错误提示语");
        return result;
      }
      return new Result().success("单个查询房间信息 成功", "单个查询房间信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMsg(e.getMessage());
      return result;
    }
  }

  @ApiOperation("分页查询房间信息")
  @PostMapping("selectByPage")
  public Result<String> selectByPage(@RequestBody RoomInfoDO roomInfoDO) {
    Result<String> result = new Result().failure("分页查询房间信息 失败", "分页查询房间信息 失败");
    try {
      if (1 > 1) {
        result.setMsg("我是错误提示语");
        return result;
      }
      return new Result().success("分页查询房间信息 成功", "分页查询房间信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMsg(e.getMessage());
      return result;
    }
  }
}
