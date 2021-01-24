package com.zjh.fangdichanhaixia.controller;

import com.zjh.fangdichanhaixia.pojo.HouseInfoDO;
import com.zjh.fangdichanhaixia.service.HouseInfoService;
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
@Api(value = "房源信息Controller",tags = "房源信息Controller")
@RequestMapping("houseInfo")
@Slf4j
public class HouseInfoController {

  @Autowired
  HouseInfoService houseInfoService;
  @ApiOperation("新增房源信息")
  @PostMapping("add")
  public Result<String> add(@RequestBody HouseInfoDO houseInfoDO) {
    Result<String> result = new Result().failure("新增房源信息 失败", "新增房源信息 失败");
    try {
      if (1 > 1) {

        result.setMessage("我是错误提示语");
        return result;
      }
      houseInfoService.add(houseInfoDO);
      return new Result().success("新增房源信息 成功", "新增房源信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("批量删除房源信息")
  @PostMapping("deleteBatch")
  public Result<String> deleteBatch(@RequestBody List<Integer> houseIds) {
    Result<String> result = new Result().failure("批量删除房源信息 失败", "批量删除房源信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      houseInfoService.deleteBatch(houseIds);
      return new Result().success("批量删除房源信息 成功", "批量删除房源信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("修改房源信息")
  @PostMapping("update")
  public Result<String> update(@RequestBody HouseInfoDO houseInfoDO) {
    Result<String> result = new Result().failure("修改房源信息 失败", "修改房源信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      houseInfoService.update(houseInfoDO);
      return new Result().success("修改房源信息 成功", "修改房源信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("单个查询房源信息")
  @PostMapping("selectById")
  public Result<HouseInfoDO> selectById(@RequestBody Integer houseId) {
    Result<HouseInfoDO> result = new Result().failure("单个查询房源信息 失败", "单个查询房源信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      HouseInfoDO houseInfoDO = houseInfoService.selectById(houseId);
      return new Result().success(houseInfoDO, "单个查询房源信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("分页查询房源信息")
  @PostMapping("selectByPage")
  public Result<PageList<HouseInfoDO>> selectByPage(@RequestBody HouseInfoDO houseInfoDO) {
    Result<PageList<HouseInfoDO>> result = new Result().failure("分页查询房源信息 失败", "分页查询房源信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      PageList<HouseInfoDO> pageList = houseInfoService.selectByPage(houseInfoDO);
      return new Result().success(pageList, "分页查询房源信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }
}
