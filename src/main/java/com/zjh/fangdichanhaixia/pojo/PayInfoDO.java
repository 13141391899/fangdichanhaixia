package com.zjh.fangdichanhaixia.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

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
public class PayInfoDO extends BaseDO{

  /**
   * 主键id
   */
  @ApiModelProperty(value = "主键id", example = "1")
  private Integer id;

  /**
   * 支付类型 1给房东打款  2从租户收款  3.房屋公共维修   4.房屋水电燃气物业
   */
  @ApiModelProperty(value = "支付类型 1给房东打款  2从租户收款  3.房屋公共维修   4.房屋水电燃气物业", example = "1")
  private Integer payType;

  /**
   * 备注
   */
  @ApiModelProperty(value = "备注", example = "备注")
  private String remarks;

  /**
   * 房源ID
   */
  @ApiModelProperty(value = "房源ID", example = "1")
  private Integer houseId;

  /**
   * 房间ID
   */
  @ApiModelProperty(value = "房间ID", example = "1")
  private Integer roomId;

  /**
   * 预计付款时间
   */
  @ApiModelProperty(value = "预计付款时间", example = "2020-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date expectPayTime;

  /**
   * 实际付款时间
   */
  @ApiModelProperty(value = "实际付款时间", example = "2020-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date realPayTime;

  /**
   * 支付金额
   */
  @ApiModelProperty(value = "支付金额", example = "1.00")
  private BigDecimal payAmount;

  /**
   * 支付状态  0未支付  1已支付
   */
  @ApiModelProperty(value = "支付状态  0未支付  1已支付", example = "1")
  private Integer payStatus;

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
