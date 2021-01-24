package com.zjh.fangdichanhaixia.controller;

import com.zjh.fangdichanhaixia.pojo.BossInfoDO;
import com.zjh.fangdichanhaixia.service.BossInfoService;
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
@Api(value = "老板信息Controller",tags = "老板信息Controller")
@RequestMapping("bossInfo")
@Slf4j
public class BossInfoController {

  @Autowired
  BossInfoService bossInfoService;

  @ApiOperation("新增老板信息")
  @PostMapping("add")
  public Result<String> add(@RequestBody BossInfoDO bossInfoDO) {
    Result<String> result = new Result().failure("新增老板信息 失败", "新增老板信息 失败");
    try {
     bossInfoService.add(bossInfoDO);
      return new Result().success("新增老板信息 成功", "新增老板信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("批量删除老板信息")
  @PostMapping("deleteBatch")
  public Result<String> deleteBatch(@RequestBody List<Integer> bossIds) {
    Result<String> result = new Result().failure("批量删除老板信息 失败", "批量删除老板信息 失败");
    try {
      bossInfoService.deleteBatch(bossIds);
      return new Result().success("批量删除老板信息 成功", "批量删除老板信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("修改老板信息")
  @PostMapping("update")
  public Result<String> update(@RequestBody BossInfoDO bossInfoDO) {
    Result<String> result = new Result().failure("修改老板信息 失败", "修改老板信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      bossInfoService.update(bossInfoDO);
      return new Result().success("修改老板信息 成功", "修改老板信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("单个查询老板信息")
  @PostMapping("selectById")
  public Result<BossInfoDO> selectById(@RequestBody Integer bossId) {
    Result<BossInfoDO> result = new Result().failure("单个查询老板信息 失败", "单个查询老板信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      BossInfoDO bossInfoDO =  bossInfoService.selectById(bossId);
      return new Result().success(bossInfoDO, "单个查询老板信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("分页查询老板信息")
  @PostMapping("selectByPage")
  public Result<PageList<BossInfoDO>> selectByPage(@RequestBody BossInfoDO bossInfoDO) {
    Result<PageList<BossInfoDO>> result = new Result().failure("分页查询老板信息 失败", "分页查询老板信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      PageList<BossInfoDO> pageList = bossInfoService.selectByPage(bossInfoDO);
      return new Result().success(pageList, "分页查询老板信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }
}
