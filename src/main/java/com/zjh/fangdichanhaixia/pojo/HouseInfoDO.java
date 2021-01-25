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
 * Description:房源信息
 * @author 赵剑宏
 * Date 2020-12-21
 */
@Data
@ApiModel("房源信息对象")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HouseInfoDO extends BaseDO{

  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", example = "1")
  private Integer id;

  /**
   * 老板ID
   */
  @ApiModelProperty(value = "老板ID", example = "1")
  private Integer bossId;

  /**
   * 房源地址
   */
  @ApiModelProperty(value = "房源地址", example = "太原市小店区保利和光尘越")
  private String address;

  /**
   * 房东名称
   */
  @ApiModelProperty(value = "房东名称", example = "王房东")
  private String ownerName;

  /**
   * 房东电话号
   */
  @ApiModelProperty(value = "房东电话号", example = "1231234124")
  private String ownerPhoneNumber;

  /**
   * 收款人名称
   */
  @ApiModelProperty(value = "收款人名称", example = "王老板")
  private String payeeName;

  /**
   * 收款人手机号
   */
  @ApiModelProperty(value = "收款人手机号", example = "12341234123")
  private String payeePhoneNumber;

  /**
   * 合同开始日期
   */
  @ApiModelProperty(value = "合同开始日期", example = "2020-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date contractStartTime;

  /**
   * 合同结束日期
   */
  @ApiModelProperty(value = "合同结束日期", example = "2020-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date contractEndTime;

  /**
   * 租住类型  1整租 2合租
   */
  @ApiModelProperty(value = "租住类型  1整租 2合租", example = "1")
  private Integer rentedType;
  /**
   * 租住类型  1整租 2合租
   */
  @ApiModelProperty(value = "租住类型  1整租 2合租", example = "1")
  private Integer rentedTypeStr;

  /**
   * 创建人
   */
  @ApiModelProperty(value = "创建人", example = "创建人")
  private String creatorName;

  /**
   * 更新人
   */
  @ApiModelProperty(value = "更新人", example = "更新人")
  private String updatorName;

  /**
   * 更新时间
   */
  @ApiModelProperty(value = "更新时间", example = "1970-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date updateTime;

  @ApiModelProperty(value = "创建时间,制单时间", example = "1970-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date createTime;
}
