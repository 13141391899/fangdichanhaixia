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
   * 收款类型
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
   * 支出类型
   */
  enum PayType{
    //库存类型：0正品1残品2异常品3过期品
    FANGZU(1, "房租"),
    SHUIFEI(2, "水费"),
    DIANFEI(3, "电费"),
    WUYEFEI(4, "物业费"),
    RANQIFEI(5, "燃气费"),
    TUIYAJIN(6, "退押金"),
    WEIXIU(7, "维修费"),
    ZHUANGXIU(8, "装修费");
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
