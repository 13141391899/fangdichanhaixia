package com.zjh.fangdichanhaixia.controller;

import com.zjh.fangdichanhaixia.pojo.BossInfoDO;
import com.zjh.fangdichanhaixia.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "老板信息Controller")
@RequestMapping("bossInfo")
@Slf4j
public class BossInfoController {
    @ApiOperation("新增老板信息")
    @PostMapping("add")
    public Result<String> add(BossInfoDO bossInfoDO) {
        Result<String> result = new Result().failure("新增老板信息 失败", "新增老板信息 失败");
        try {
            if (1 > 1) {
                result.setMsg("我是错误提示语");
                return result;
            }
            return new Result().success("新增老板信息 成功", "新增老板信息 成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg(e.getMessage());
            return result;
        }
    }

    @ApiOperation("批量删除老板信息")
    @PostMapping("deleteBatch")
    public Result<String> deleteBatch(List<Integer> bossIds) {
        Result<String> result = new Result().failure("批量删除老板信息 失败", "批量删除老板信息 失败");
        try {
            if (1 > 1) {
                result.setMsg("我是错误提示语");
                return result;
            }
            return new Result().success("批量删除老板信息 成功", "批量删除老板信息 成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg(e.getMessage());
            return result;
        }
    }

    @ApiOperation("修改老板信息")
    @PostMapping("update")
    public Result<String> update(BossInfoDO bossInfoDO) {
        Result<String> result = new Result().failure("修改老板信息 失败", "修改老板信息 失败");
        try {
            if (1 > 1) {
                result.setMsg("我是错误提示语");
                return result;
            }
            return new Result().success("修改老板信息 成功", "修改老板信息 成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg(e.getMessage());
            return result;
        }
    }

    @ApiOperation("单个查询老板信息")
    @PostMapping("selectById")
    public Result<String> selectById(Integer bossId) {
        Result<String> result = new Result().failure("单个查询老板信息 失败", "单个查询老板信息 失败");
        try {
            if (1 > 1) {
                result.setMsg("我是错误提示语");
                return result;
            }
            return new Result().success("单个查询老板信息 成功", "单个查询老板信息 成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg(e.getMessage());
            return result;
        }
    }

    @ApiOperation("分页查询老板信息")
    @PostMapping("selectByPage")
    public Result<String> selectByPage(BossInfoDO bossInfoDO) {
        Result<String> result = new Result().failure("分页查询老板信息 失败", "分页查询老板信息 失败");
        try {
            if (1 > 1) {
                result.setMsg("我是错误提示语");
                return result;
            }
            return new Result().success("分页查询老板信息 成功", "分页查询老板信息 成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg(e.getMessage());
            return result;
        }
    }
}
