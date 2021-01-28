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
 * Description:每个房源下的房间信息
 *
 * @author 赵剑宏
 * Date 2020-12-21
 */
@Data
@ApiModel("房间信息对象")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomInfoDO extends BaseDO {

  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", example = "1")
  private Integer id;

  /**
   * 对应的房源ID
   */
  @ApiModelProperty(value = "对应的房源ID", example = "1")
  private Integer houseId;

  /**
   * 房间名称
   */
  @ApiModelProperty(value = "房间名称", example = "房间名称")
  private String name;

  /**
   * 房间租住状态  1待出租 2已出租
   */
  @ApiModelProperty(value = "房间租住状态  1待出租 2已出租", example = "1")
  private Integer rentedStatus;

  /**
   * 房间租住状态  1待出租 2已出租
   */
  @ApiModelProperty(value = "房间租住状态  1待出租 2已出租", example = "1")
  private String rentedStatusStr;

  /**
   * 租房人名称
   */
  @ApiModelProperty(value = "租房人名称", example = "租房人名称")
  private String rentPeopleName;

  /**
   * 租房人电话
   */
  @ApiModelProperty(value = "租房人电话", example = "12341231234")
  private String rentPeoplePhoneNumber;

  /**
   * 付款类型 1年付  2半年付  3押一付三  4押一付一
   */
  @ApiModelProperty(value = "付款类型 1年付  2半年付  3押一付三  4押一付一", example = "1")
  private Integer payorType;

  /**
   * 付款类型 1年付  2半年付  3押一付三  4押一付一
   */
  @ApiModelProperty(value = "付款类型 1年付  2半年付  3押一付三  4押一付一", example = "1")
  private String payorTypeStr;

  /**
   * 租住开始时间
   */
  @ApiModelProperty(value = "合同开始时间", example = "1970-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date contractStartTime;

  /**
   * 租住结束时间
   */
  @ApiModelProperty(value = "合同结束时间", example = "1970-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date contractEndTime;

  /**
   * 合同编号
   */
  @ApiModelProperty(value = "合同编号  ", example = "奥术大师1")
  private String contractCode;

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
