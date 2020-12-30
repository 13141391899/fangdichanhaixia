package com.zjh.fangdichanhaixia.pojo;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
  private Integer id;

  /**
   * 老板ID
   */
  private Integer bossId;

  /**
   * 房源地址
   */
  private String address;

  /**
   * 房东名称
   */
  private String ownerName;

  /**
   * 房东电话号
   */
  private String ownerPhoneNumber;

  /**
   * 收款人名称
   */
  private String payeeName;

  /**
   * 收款人手机号
   */
  private String payeePhoneNumber;

  /**
   * 合同开始日期
   */
  private String contractStartTime;

  /**
   * 合同结束日期
   */
  private String contractEndTime;

  /**
   * 租住类型  1整租 2合租
   */
  private Integer rentedType;

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
