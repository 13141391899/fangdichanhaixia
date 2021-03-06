package com.zjh.fangdichanhaixia.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Description:操作日志表
 *
 * @author 赵剑宏
 * Date 2021-01-28
 */
@Data
@ApiModel("操作日志表")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OplogInfoDO extends BaseDO {

  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", example = "1")
  private Integer id;

  /**
   * 操作类型
   */
  @ApiModelProperty(value = "操作类型  1新增老板信息  2修改老板信息  3删除老板信息 4新增房源信息  5修改房源信息  6删除房源信息  " +
    "7新增房间信息  8修改房间信息  9删除房间信息  10新增支付信息  11修改支付信息  12删除支付信息 13登录系统  14退出系统", example = "1")
  private Integer type;

  /**
   * 操作类型
   */
  @ApiModelProperty(value = "操作类型  1新增老板信息  2修改老板信息  3删除老板信息 4新增房源信息  5修改房源信息  6删除房源信息  " +
    "7新增房间信息  8修改房间信息  9删除房间信息  10新增支付信息  11修改支付信息  12删除支付信息 13登录系统  14退出系统", example = "1")
  private String typeStr;

  /**
   * 操作人
   */
  @ApiModelProperty(value = "操作人", example = "1")
  private String creatorName;

  /**
   * 操作时间
   */
  @ApiModelProperty(value = "操作时间", example = "2020-01-01 01:01:01")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;

  /**
   * 操作时间
   */
  @ApiModelProperty(value = "操作时间", example = "2020-01-01 01:01:01")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTimeStart;

  /**
   * 操作时间
   */
  @ApiModelProperty(value = "操作时间", example = "2020-01-01 01:01:01")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTimeEnd;

  @ApiModelProperty(value = "合同起止日期", example = "2020-01-01 01:01:01")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
  private Date[] createTimeArr;

  /**
   * 操作前的旧值
   */
  @ApiModelProperty(value = "操作前的旧值", example = "1")
  private String contentOld;

  /**
   * 操作后的新值
   */
  @ApiModelProperty(value = "操作后的新值", example = "1")
  private String contentNew;

  /**
   * 是否已逻辑删除 0未删除  1已删除
   */
  @ApiModelProperty(value = "是否已逻辑删除", example = "1")
  private Integer isDeleted;
}
