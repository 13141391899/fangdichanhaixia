package com.zjh.fangdichanhaixia.pojo;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
  private Integer id;

  /**
   * 老板名称
   */
  private String name;

  /**
   * 老板手机号
   */
  private String phoneNumber;
}
