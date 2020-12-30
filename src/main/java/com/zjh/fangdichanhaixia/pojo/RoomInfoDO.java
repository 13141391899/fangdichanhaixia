package com.zjh.fangdichanhaixia.pojo;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:每个房源下的房间信息
 * @author 赵剑宏
 * Date 2020-12-21
 */
@Data
@ApiModel("房间信息对象")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomInfoDO extends BaseDO{

  /**
   * 主键id
   */
  private Integer id;

  /**
   * 对应的房源ID
   */
  private Integer houseId;

  /**
   * 房间名称
   */
  private String name;

  /**
   * 房间租住状态  1待出租 2已出租
   */
  private Integer rentedStatus;

  /**
   * 租房人名称
   */
  private String rentPeopleName;

  /**
   * 租房人电话
   */
  private String rentPeoplePhoneNumber;

  /**
   * 付款类型 1年付  2半年付  3押一付三  4押一付一
   */
  private Integer payorType;

  /**
   * 租住开始时间
   */
  private String contractStartTime;

  /**
   * 租住结束时间
   */
  private String contractEndTime;

  /**
   * 创建人
   */
  private String creatorName;

  /**
   * 更新人
   */
  private String updatorName;

  /**
   * 更新时间
   */
  private String updateTime;


}
