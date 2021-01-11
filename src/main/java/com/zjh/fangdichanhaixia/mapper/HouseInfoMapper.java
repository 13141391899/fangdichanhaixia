package com.zjh.fangdichanhaixia.mapper;

import com.zjh.fangdichanhaixia.pojo.HouseInfoDO;
import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
public interface HouseInfoMapper {
  List<HouseInfoDO> selectByPage(HouseInfoDO houseInfoDO);

  void add(HouseInfoDO houseInfoDO);

  void deleteBatch(@Param("houseIds")List<Integer> houseIds);

  void update(HouseInfoDO houseInfoDO);

  HouseInfoDO selectById(Integer houseId);}
