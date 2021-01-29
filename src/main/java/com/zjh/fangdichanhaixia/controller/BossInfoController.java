package com.zjh.fangdichanhaixia.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjh.fangdichanhaixia.enums.EnumInterface;
import com.zjh.fangdichanhaixia.pojo.BossInfoDO;
import com.zjh.fangdichanhaixia.pojo.OplogInfoDO;
import com.zjh.fangdichanhaixia.service.BossInfoService;
import com.zjh.fangdichanhaixia.service.OpLogInfoService;
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

import java.util.List;

@RestController
@Api(value = "老板信息Controller", tags = "老板信息Controller")
@RequestMapping("bossInfo")
@Slf4j
@Transactional
public class BossInfoController {

  @Autowired
  BossInfoService bossInfoService;
  @Autowired
  OpLogInfoService opLogInfoService;

  @ApiOperation("新增老板信息")
  @PostMapping("add")
  public Result<String> add(@RequestBody BossInfoDO bossInfoDO) {
    log.info(" 新增老板信息 入参={}", JSONObject.toJSONString(bossInfoDO));
    Result<String> result = new Result().failure("新增老板信息 失败", "新增老板信息 失败");
    try {
      bossInfoService.add(bossInfoDO);
      opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.ADD_BOSS.getCode()).contentNew(JSONObject.toJSONString(bossInfoDO)).contentOld(null).build());
      result = new Result().success("新增老板信息 成功", "新增老板信息 成功");
      log.info(" 新增老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error(" 新增老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("批量删除老板信息")
  @PostMapping("deleteBatch")
  public Result<String> deleteBatch(@RequestBody List<Integer> bossIds) {
    log.info(" 批量删除老板信息 入参={}", JSONObject.toJSONString(bossIds));
    Result<String> result = new Result().failure("批量删除老板信息 失败", "批量删除老板信息 失败");
    try {
      bossInfoService.deleteBatch(bossIds);
      opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.DELETE_BOSS.getCode()).contentNew(JSONObject.toJSONString(bossIds)).contentOld(null).build());
      result = new Result().success("批量删除老板信息 成功", "批量删除老板信息 成功");
      log.info(" 批量删除老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error(" 批量删除老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("修改老板信息")
  @PostMapping("update")
  public Result<String> update(@RequestBody BossInfoDO bossInfoDO) {
    log.info(" 修改老板信息 入参={}", JSONObject.toJSONString(bossInfoDO));

    Result<String> result = new Result().failure("修改老板信息 失败", "修改老板信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      BossInfoDO bossInfoDOOld = bossInfoService.selectById(bossInfoDO.getId());
      bossInfoService.update(bossInfoDO);
      opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.UPDATE_BOSS.getCode()).contentNew(JSONObject.toJSONString(bossInfoDO)).contentOld(JSONObject.toJSONString(bossInfoDOOld)).build());
      result = new Result().success("修改老板信息 成功", "修改老板信息 成功");
      log.info("修改老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("修改老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("单个查询老板信息")
  @PostMapping("selectById")
  public Result<BossInfoDO> selectById(@RequestBody Integer bossId) {
    log.info(" 单个查询老板信息 入参={}", bossId);
    Result<BossInfoDO> result = new Result().failure("单个查询老板信息 失败", "单个查询老板信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      BossInfoDO bossInfoDO = bossInfoService.selectById(bossId);
      result = new Result().success(bossInfoDO, "单个查询老板信息 成功");
      log.info(" 单个查询老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error(" 单个查询老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("分页查询老板信息")
  @PostMapping("selectByPage")
  public Result<PageList<BossInfoDO>> selectByPage(@RequestBody BossInfoDO bossInfoDO) {
    log.info(" 分页查询老板信息 入参={}", JSONObject.toJSONString(bossInfoDO));

    Result<PageList<BossInfoDO>> result = new Result().failure("分页查询老板信息 失败", "分页查询老板信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      PageList<BossInfoDO> pageList = bossInfoService.selectByPage(bossInfoDO);
      result = new Result().success(pageList, "分页查询老板信息 成功");
      log.info("分页查询老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("分页查询老板信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }
}
