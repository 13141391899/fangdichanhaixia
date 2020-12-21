package com.zjh.fangdichanhaixia.mapper;

import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
@Repository
@Mapper
public interface RoomInfoMapper {
  List<RoomInfoDO> getAllRoomInfo();
}
