package com.zjh.fangdichanhaixia.controller;

import com.zjh.fangdichanhaixia.pojo.PayInfoDO;
import com.zjh.fangdichanhaixia.service.PayInfoService;
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
@Api(value = "支付信息Controller",tags = "支付信息Controller")
@RequestMapping("payInfo")
@Slf4j
public class PayInfoController {

  @Autowired
  PayInfoService payInfoService;

  @ApiOperation("新增支付信息")
  @PostMapping("add")
  public Result<String> add(@RequestBody PayInfoDO payInfoDO) {
    Result<String> result = new Result().failure("新增支付信息 失败", "新增支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      payInfoService.add(payInfoDO);
      return new Result().success("新增支付信息 成功", "新增支付信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("批量删除支付信息")
  @PostMapping("deleteBatch")
  public Result<String> deleteBatch(@RequestBody List<Integer> payIds) {
    Result<String> result = new Result().failure("批量删除支付信息 失败", "批量删除支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      payInfoService.deleteBatch(payIds);
      return new Result().success("批量删除支付信息 成功", "批量删除支付信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("修改支付信息")
  @PostMapping("update")
  public Result<String> update(@RequestBody PayInfoDO payInfoDO) {
    Result<String> result = new Result().failure("修改支付信息 失败", "修改支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      payInfoService.update(payInfoDO);
      return new Result().success("修改支付信息 成功", "修改支付信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("单个查询支付信息")
  @PostMapping("selectById")
  public Result<PayInfoDO> selectById(@RequestBody Integer payId) {
    Result<PayInfoDO> result = new Result().failure("单个查询支付信息 失败", "单个查询支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
      PayInfoDO payInfoDO =  payInfoService.selectById(payId);
      return new Result().success(payInfoDO, "单个查询支付信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }

  @ApiOperation("分页查询支付信息")
  @PostMapping("selectByPage")
  public Result<PageList<PayInfoDO>> selectByPage(@RequestBody PayInfoDO payInfoDO) {
    Result<PageList<PayInfoDO>> result = new Result().failure("分页查询支付信息 失败", "分页查询支付信息 失败");
    try {
      if (1 > 1) {
        result.setMessage("我是错误提示语");
        return result;
      }
     PageList<PayInfoDO> pageList =  payInfoService.selectByPage(payInfoDO);
      return new Result().success(pageList, "分页查询支付信息 成功");
    } catch (Exception e) {
      e.printStackTrace();
      result.setMessage(e.getMessage());
      return result;
    }
  }
}
