package com.zjh.fangdichanhaixia.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

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
  @ApiModelProperty(value = "操作类型", example = "1")
  private Integer type;

  /**
   * 操作人
   */
  @ApiModelProperty(value = "操作人", example = "1")
  private String creatorName;

  /**
   * 操作时间
   */
  @ApiModelProperty(value = "操作时间", example = "1")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
  private String createTime;

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
