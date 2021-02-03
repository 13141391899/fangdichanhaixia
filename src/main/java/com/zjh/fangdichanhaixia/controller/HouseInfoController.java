package com.zjh.fangdichanhaixia.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjh.fangdichanhaixia.enums.EnumInterface;
import com.zjh.fangdichanhaixia.pojo.BossInfoDO;
import com.zjh.fangdichanhaixia.pojo.HouseInfoDO;
import com.zjh.fangdichanhaixia.pojo.OplogInfoDO;
import com.zjh.fangdichanhaixia.service.HouseInfoService;
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

import java.util.Date;
import java.util.List;


@RestController
@Api(value = "房源信息Controller", tags = "房源信息Controller")
@RequestMapping("houseInfo")
@Slf4j
@Transactional
public class HouseInfoController {

    @Autowired
    HouseInfoService houseInfoService;
    @Autowired

    OpLogInfoService opLogInfoService;

    @ApiOperation("新增房源信息")
    @PostMapping("add")
    public Result<String> add(@RequestBody HouseInfoDO houseInfoDO) {
        log.info(" 新增房源信息 入参={}", JSONObject.toJSONString(houseInfoDO));

        Result<String> result = new Result().failure("新增房源信息 失败", "新增房源信息 失败");
        try {
            if (1 > 1) {
                result.setMessage("我是错误提示语");
                return result;
            }
            if (null != houseInfoDO.getContracTimeArr()) {
                houseInfoDO.setContractStartTime(houseInfoDO.getContracTimeArr()[0]);
                houseInfoDO.setContractEndTime(houseInfoDO.getContracTimeArr()[1]);
            }
            houseInfoDO.setCreatorName("王海霞");
            houseInfoDO.setUpdatorName("王海霞");
            houseInfoDO.setUpdateTime(new Date());
            houseInfoService.add(houseInfoDO);
            opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.ADD_HOUSE.getCode()).contentNew(JSONObject.toJSONString(houseInfoDO)).contentOld(null).build());
            result = new Result().success("新增房源信息 成功", "新增房源信息 成功");
            log.info(" 新增房源信息 出参={}", JSONObject.toJSONString(result));
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage(e.getMessage());
            log.error(" 新增房源信息 出参={}", JSONObject.toJSONString(result));
            return result;
        }
    }

    @ApiOperation("批量删除房源信息")
    @PostMapping("deleteBatch")
    public Result<String> deleteBatch(@RequestBody List<Integer> houseIds) {
        log.info("批量删除房源信息 入参={}", JSONObject.toJSONString(houseIds));

        Result<String> result = new Result().failure("批量删除房源信息 失败", "批量删除房源信息 失败");
        try {
            if (1 > 1) {
                result.setMessage("我是错误提示语");
                return result;
            }
            houseInfoService.deleteBatch(houseIds);
            opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.DELETE_BOSS.getCode()).contentNew(JSONObject.toJSONString(houseIds)).contentOld(null).build());
            result = new Result().success("批量删除房源信息 成功", "批量删除房源信息 成功");
            log.info("批量删除房源信息 出参={}", JSONObject.toJSONString(result));

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage(e.getMessage());
            log.error("批量删除房源信息 出参={}", JSONObject.toJSONString(result));
            return result;
        }
    }

    @ApiOperation("修改房源信息")
    @PostMapping("update")
    public Result<String> update(@RequestBody HouseInfoDO houseInfoDO) {
        log.info("修改房源信息 入参={}", JSONObject.toJSONString(houseInfoDO));

        Result<String> result = new Result().failure("修改房源信息 失败", "修改房源信息 失败");
        try {
            if (1 > 1) {
                result.setMessage("我是错误提示语");
                return result;
            }
            if (null != houseInfoDO.getContracTimeArr()) {
                houseInfoDO.setContractStartTime(houseInfoDO.getContracTimeArr()[0]);
                houseInfoDO.setContractEndTime(houseInfoDO.getContracTimeArr()[1]);
            }
            HouseInfoDO houseInfoDOOld = houseInfoService.selectById(houseInfoDO.getId());
            houseInfoService.update(houseInfoDO);
            opLogInfoService.add(OplogInfoDO.builder().type(EnumInterface.OpType.UPDATE_BOSS.getCode()).contentNew(JSONObject.toJSONString(houseInfoDO)).contentOld(JSONObject.toJSONString(houseInfoDOOld)).build());
            result = new Result().success("修改房源信息 成功", "修改房源信息 成功");

            log.info("修改房源信息 出参={}", JSONObject.toJSONString(result));
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage(e.getMessage());
            log.error("修改房源信息 出参={}", JSONObject.toJSONString(result));
            return result;
        }
    }

    @ApiOperation("单个查询房源信息")
    @PostMapping("selectById")
    public Result<HouseInfoDO> selectById(@RequestBody Integer houseId) {
        log.info(" 单个查询房源信息 入参={}", houseId);

        Result<HouseInfoDO> result = new Result().failure("单个查询房源信息 失败", "单个查询房源信息 失败");
        try {
            if (1 > 1) {
                result.setMessage("我是错误提示语");
                return result;
            }
            HouseInfoDO houseInfoDO = houseInfoService.selectById(houseId);
            result = new Result().success(houseInfoDO, "单个查询房源信息 成功");
            log.info("单个查询房源信息 出参={}", JSONObject.toJSONString(result));

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage(e.getMessage());
            log.error("单个查询房源信息 出参={}", JSONObject.toJSONString(result));
            return result;
        }
    }

    @ApiOperation("分页查询房源信息")
    @PostMapping("selectByPage")
    public Result<PageList<HouseInfoDO>> selectByPage(@RequestBody HouseInfoDO houseInfoDO) {
        log.info("分页查询房源信息 入参={}", JSONObject.toJSONString(houseInfoDO));

        Result<PageList<HouseInfoDO>> result = new Result().failure("分页查询房源信息 失败", "分页查询房源信息 失败");
        try {
            if (1 > 1) {
                result.setMessage("我是错误提示语");
                return result;
            }
            if (null != houseInfoDO.getContracTimeArr()) {
                houseInfoDO.setContractStartTime(houseInfoDO.getContracTimeArr()[0]);
                houseInfoDO.setContractEndTime(houseInfoDO.getContracTimeArr()[1]);
            }
            System.out.println(houseInfoDO.getContracTimeArr());
            System.out.println(houseInfoDO.getContractStartTime());
            PageList<HouseInfoDO> pageList = houseInfoService.selectByPage(houseInfoDO);
            result = new Result().success(pageList, "分页查询房源信息 成功");
            log.info("分页查询房源信息 出参={}", JSONObject.toJSONString(result));
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage(e.getMessage());
            log.error("分页查询房源信息 出参={}", JSONObject.toJSONString(result));
            return result;
        }
    }
}
