package com.zjh.fangdichanhaixia.pojo;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Description:所有的付款收款信息
 * @author 赵剑宏
 * Date 2020-12-21
 */
@Data
@ApiModel("付款收款信息对象")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayInfoDO {

  /**
   * 主键id
   */
  private Integer id;

  /**
   * 支付类型 1给房东打款  2从租户收款  3.房屋公共维修   4.房屋水电燃气物业
   */
  private Integer payType;

  /**
   * 备注
   */
  private String remarks;

  /**
   * 房源ID
   */
  private Integer houseId;

  /**
   * 房间ID
   */
  private Integer roomId;

  /**
   * 预计付款时间
   */
  private String expectPayTime;

  /**
   * 实际付款时间
   */
  private String realPayTime;

  /**
   * 支付金额
   */
  private BigDecimal payAmount;

  /**
   * 支付状态  0未支付  1已支付
   */
  private Integer payStatus;

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

  /**
   * 是否已删除  0未删除  1已删除
   */
  private Integer isDeleted;
}
