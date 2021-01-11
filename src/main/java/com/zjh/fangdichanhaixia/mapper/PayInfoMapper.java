package com.zjh.fangdichanhaixia.mapper;

import com.zjh.fangdichanhaixia.pojo.PayInfoDO;
import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
public interface PayInfoMapper {
  List<PayInfoDO> selectByPage(PayInfoDO payInfoDO);

  void add(PayInfoDO payInfoDO);

  void deleteBatch(@Param("payIds")List<Integer> payIds);

  void update(PayInfoDO payInfoDO);

  PayInfoDO selectById(Integer payId);}
