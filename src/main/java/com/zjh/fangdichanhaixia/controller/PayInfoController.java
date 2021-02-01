package com.zjh.fangdichanhaixia.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjh.fangdichanhaixia.enums.EnumInterface;
import com.zjh.fangdichanhaixia.pojo.BossInfoDO;
import com.zjh.fangdichanhaixia.pojo.OplogInfoDO;
import com.zjh.fangdichanhaixia.pojo.PayInfoDO;
import com.zjh.fangdichanhaixia.service.OpLogInfoService;
import com.zjh.fangdichanhaixia.service.PayInfoService;
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
@Api(value = "支付信息Controller", tags = "支付信息Controller")
@RequestMapping("payInfo")
@Slf4j
@Transactional
public class PayInfoController {

  @Autowired
  PayInfoService payInfoService;
  @Autowired
  OpLogInfoService opLogInfoService;

  @ApiOperation("新增支付信息")
  @PostMapping("add")
  public Result<String> add(@RequestBody PayInfoDO payInfoDO) {
    log.info("新增支付信息 入参={}", JSONObject.toJSONString(payInfoDO));

    Result<String> result = new Result().failure("新增支付信息 失败", "新增支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      payInfoDO.setCreatorName("王海霞");
      payInfoDO.setUpdatorName("王海霞");
      payInfoService.add(payInfoDO);
      opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.ADD_PAY.getCode()).contentNew(JSONObject.toJSONString(payInfoDO)).contentOld(null).build());
      result = new Result().success("新增支付信息 成功", "新增支付信息 成功");
      log.info("新增支付信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("新增支付信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("批量删除支付信息")
  @PostMapping("deleteBatch")
  public Result<String> deleteBatch(@RequestBody List<Integer> payIds) {
    log.info("批量删除支付信息 入参={}", JSONObject.toJSONString(payIds));

    Result<String> result = new Result().failure("批量删除支付信息 失败", "批量删除支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      payInfoService.deleteBatch(payIds);
      opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.DELETE_PAY.getCode()).contentNew(JSONObject.toJSONString(payIds)).contentOld(null).build());
      result = new Result().success("批量删除支付信息 成功", "批量删除支付信息 成功");
      log.info("批量删除支付信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("批量删除支付信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("修改支付信息")
  @PostMapping("update")
  public Result<String> update(@RequestBody PayInfoDO payInfoDO) {
    log.info("修改支付信息 入参={}", JSONObject.toJSONString(payInfoDO));

    Result<String> result = new Result().failure("修改支付信息 失败", "修改支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      PayInfoDO payInfoDOOld = payInfoService.selectById(payInfoDO.getId());
      payInfoDO.setUpdatorName("王海霞");
      payInfoDO.setUpdateTime(new Date());
      payInfoService.update(payInfoDO);
      opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.UPDATE_BOSS.getCode()).contentNew(JSONObject.toJSONString(payInfoDO)).contentOld(JSONObject.toJSONString(payInfoDOOld)).build());
      result = new Result().success("修改支付信息 成功", "修改支付信息 成功");
      log.info("修改支付信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("修改支付信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("单个查询支付信息")
  @PostMapping("selectById")
  public Result<PayInfoDO> selectById(@RequestBody Integer payId) {
    log.info(" 单个查询支付信息 入参={}", payId);

    Result<PayInfoDO> result = new Result().failure("单个查询支付信息 失败", "单个查询支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      PayInfoDO payInfoDO = payInfoService.selectById(payId);
      result = new Result().success(payInfoDO, "单个查询支付信息 成功");
      log.info(" 单个查询支付信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error(" 单个查询支付信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }

  @ApiOperation("分页查询支付信息")
  @PostMapping("selectByPage")
  public Result<PageList<PayInfoDO>> selectByPage(@RequestBody PayInfoDO payInfoDO) {
    log.info("分页查询支付信息 入参={}", JSONObject.toJSONString(payInfoDO));

    Result<PageList<PayInfoDO>> result = new Result().failure("分页查询支付信息 失败", "分页查询支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      PageList<PayInfoDO> pageList = payInfoService.selectByPage(payInfoDO);
      result = new Result().success(pageList, "分页查询支付信息 成功");
      log.info("分页查询支付信息 出参={}", JSONObject.toJSONString(result));

      return result;
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      log.error("分页查询支付信息 出参={}", JSONObject.toJSONString(result));
      return result;
    }
  }
}
