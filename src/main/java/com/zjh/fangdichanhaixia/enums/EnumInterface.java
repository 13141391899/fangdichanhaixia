package com.zjh.fangdichanhaixia.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhao JianHong on 2020/5/21.
 */

/**
 * 申请货区枚举
 */
public interface EnumInterface {
  /**
   * 出租类型
   */
  enum RentedStatus{
    YIZUZHU(1, "已出租"),
    WEICHUZU(2, "未出租");
    /**
     * 编码
     */
    private Integer code;
    /**
     * 名称
     */
    private String name;

    RentedStatus(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    /**
     * 根据code值获取name值
     * @param code
     * @return
     */
    public static String getNameByCode(Integer code) {
        for (RentedStatus e : RentedStatus.values()) {
            if (code.equals(e.getCode())) {
                return e.getName();
            }
        }
        return null;
    }

    /**
     * 获取所有的枚举值
     * @return
     */
    public static Map<Object,Object> getAllApplyArea() {
        Map<Object,Object> map = new HashMap<>();
        for (RentedStatus e : RentedStatus.values()) {
            map.put(e.getCode(),e.getName());
        }
        return map;
    }
  }

  /**
   * 支付状态
   */
  enum PayStatus{
    YISHOUKUAN(1, "已支付"),
    WEISHOUKUAN(2, "未支付");
    /**
     * 编码
     */
    private Integer code;
    /**
     * 名称
     */
    private String name;

    PayStatus(Integer code, String name) {
      this.code = code;
      this.name = name;
    }

    public Integer getCode() {
      return code;
    }

    public String getName() {
      return name;
    }

    /**
     * 根据code值获取name值
     * @param code
     * @return
     */
    public static String getNameByCode(Integer code) {
      for (PayStatus e : PayStatus.values()) {
        if (code.equals(e.getCode())) {
          return e.getName();
        }
      }
      return null;
    }

    /**
     * 获取所有的枚举值
     * @return
     */
    public static Map<Object,Object> getAllApplyArea() {
      Map<Object,Object> map = new HashMap<>();
      for (PayStatus e : PayStatus.values()) {
        map.put(e.getCode(),e.getName());
      }
      return map;
    }
  }

  /**
   * 支出类型
   */
  enum PayType{
    //库存类型：0正品1残品2异常品3过期品
    FU_FANGZU(1, "支付房东房租"),
    SHOU_FANGZU(2, "收取租户房租"),
    SHOU_FAJIN(3, "收取租户押金"),
    FU_YAJIN(4, "退还租户押金"),
    FU_COMMON(5, "房屋公共维修"),
    FU_OTHOR(6, "房屋水电燃气物业");
    /**
     * 编码
     */
    private Integer code;
    /**
     * 名称
     */
    private String name;

    PayType(Integer code, String name) {
      this.code = code;
      this.name = name;
    }

    public Integer getCode() {
      return code;
    }

    public String getName() {
      return name;
    }

    /**
     * 根据code值获取name值
     * @param code
     * @return
     */
    public static String getNameByCode(Integer code) {
      for (PayType e : PayType.values()) {
        if (code.equals(e.getCode())) {
          return e.getName();
        }
      }
      return null;
    }

    /**
     * 获取所有的枚举值
     * @return
     */
    public static Map<Object,Object> getAllApplyArea() {
      Map<Object,Object> map = new HashMap<>();
      for (PayType e : PayType.values()) {
        map.put(e.getCode(),e.getName());
      }
      return map;
    }
  }

  /**
   * 支付房租的周期类型
   */
  enum PayRentType{
    //库存类型：0正品1残品2异常品3过期品
    YUEFU(1, "年付"),
    JIFU(2, "半年付"),
    BANNAINFU(3, "押一付三"),
    NIANFU(4, "押一付一");
    /**
     * 编码
     */
    private Integer code;
    /**
     * 名称
     */
    private String name;

    PayRentType(Integer code, String name) {
      this.code = code;
      this.name = name;
    }

    public Integer getCode() {
      return code;
    }

    public String getName() {
      return name;
    }

    /**
     * 根据code值获取name值
     * @param code
     * @return
     */
    public static String getNameByCode(Integer code) {
      for (PayRentType e : PayRentType.values()) {
        if (code.equals(e.getCode())) {
          return e.getName();
        }
      }
      return null;
    }

    /**
     * 获取所有的枚举值
     * @return
     */
    public static Map<Object,Object> getAllApplyArea() {
      Map<Object,Object> map = new HashMap<>();
      for (PayRentType e : PayRentType.values()) {
        map.put(e.getCode(),e.getName());
      }
      return map;
    }
  }

  /**
   * 实付款/预付款/实收款/预收款
   */
  enum IsRealPayType{
    //库存类型：0正品1残品2异常品3过期品
    SHIFUKUAN(1, "实付款"),
    YUFUKUAN(2, "预付款"),
    SHISHOUKUAN(3, "实收款"),
    YUSHOUKUAN(4, "预收款");
    /**
     * 编码
     */
    private Integer code;
    /**
     * 名称
     */
    private String name;

    IsRealPayType(Integer code, String name) {
      this.code = code;
      this.name = name;
    }

    public Integer getCode() {
      return code;
    }

    public String getName() {
      return name;
    }

    /**
     * 根据code值获取name值
     * @param code
     * @return
     */
    public static String getNameByCode(Integer code) {
      for (IsRealPayType e : IsRealPayType.values()) {
        if (code.equals(e.getCode())) {
          return e.getName();
        }
      }
      return null;
    }

    /**
     * 获取所有的枚举值
     * @return
     */
    public static Map<Object,Object> getAllApplyArea() {
      Map<Object,Object> map = new HashMap<>();
      for (IsRealPayType e : IsRealPayType.values()) {
        map.put(e.getCode(),e.getName());
      }
      return map;
    }
  }

  /**
   * 租住类型
   */
  enum RentType{
    //库存类型：0正品1残品2异常品3过期品
    ZHENGZU(1, "整租"),
    HEZU(2, "合租");
    /**
     * 编码
     */
    private Integer code;
    /**
     * 名称
     */
    private String name;

    RentType(Integer code, String name) {
      this.code = code;
      this.name = name;
    }

    public Integer getCode() {
      return code;
    }

    public String getName() {
      return name;
    }

    /**
     * 根据code值获取name值
     * @param code
     * @return
     */
    public static String getNameByCode(Integer code) {
      for (RentType e : RentType.values()) {
        if (code.equals(e.getCode())) {
          return e.getName();
        }
      }
      return null;
    }

    /**
     * 获取所有的枚举值
     * @return
     */
    public static Map<Object,Object> getAllApplyArea() {
      Map<Object,Object> map = new HashMap<>();
      for (RentType e : RentType.values()) {
        map.put(e.getCode(),e.getName());
      }
      return map;
    }
  }
}
