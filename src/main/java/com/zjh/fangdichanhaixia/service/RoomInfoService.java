package com.zjh.fangdichanhaixia.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zjh.fangdichanhaixia.mapper.RoomInfoMapper;
import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import com.zjh.fangdichanhaixia.utils.PageList;
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

  public PageList<RoomInfoDO> selectByPage(RoomInfoDO roomInfoDO) {
    PageHelper.startPage(roomInfoDO.getPageNum(), roomInfoDO.getPageSize());
    Page<RoomInfoDO> page = (Page<RoomInfoDO>) roomInfoMapper.selectByPage(roomInfoDO);
    return new PageList<>(page);
  }

  public void add(RoomInfoDO roomInfoDO) {
    roomInfoMapper.add(roomInfoDO);
  }

  public void deleteBatch(List<Integer> bossIds) {
    roomInfoMapper.deleteBatch(bossIds);
  }

  public void update(RoomInfoDO roomInfoDO) {
    roomInfoMapper.update(roomInfoDO);
  }

  public RoomInfoDO selectById(Integer bossId) {
    return roomInfoMapper.selectById(bossId);
  }
}
