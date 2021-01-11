package com.zjh.fangdichanhaixia.mapper;

import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
public interface RoomInfoMapper {

  List<RoomInfoDO> selectByPage(RoomInfoDO roomInfoDO);

  void add(RoomInfoDO roomInfoDO);

  void deleteBatch(@Param("roomIds")List<Integer> roomIds);

  void update(RoomInfoDO roomInfoDO);

  RoomInfoDO selectById(Integer roomId);}
