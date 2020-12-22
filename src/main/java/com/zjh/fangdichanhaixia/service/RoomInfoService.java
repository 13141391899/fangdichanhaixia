package com.zjh.fangdichanhaixia.service;

import com.zjh.fangdichanhaixia.mapper.RoomInfoMapper;
import com.zjh.fangdichanhaixia.enums.RoomInfoDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
@Service
public class RoomInfoService {
  @Autowired
  private RoomInfoMapper roomInfoMapper;
  public List<RoomInfoDO> getAllRoomInfo() {
    return roomInfoMapper.getAllRoomInfo();
  }
}
