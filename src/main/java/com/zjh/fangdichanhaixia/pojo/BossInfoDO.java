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
 * Description:王海霞的房地产项目 --老板信息表
 * @author 赵剑宏
 * Date 2020-12-21
 */
@Data
@ApiModel("老板信息对象")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BossInfoDO extends BaseDO{

  /**
   * 主键id  老板id
   */
  @ApiModelProperty(value = "主键id  老板id", example = "1")
  private Integer id;

  /**
   * 老板名称
   */
  @ApiModelProperty(value = "老板名称", example = "王老板")
  private String name;

  /**
   * 老板手机号
   */
  @ApiModelProperty(value = "老板手机号", example = "1311234123")
  private String phoneNumber;
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
  @ApiModelProperty(value = "更新时间", example = "2020-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date updateTime;

  @ApiModelProperty(value = "创建时间,制单时间", example = "1970-01-01")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private Date createTime;
}
