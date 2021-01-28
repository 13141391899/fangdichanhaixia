package com.zjh.fangdichanhaixia.mapper;

import com.zjh.fangdichanhaixia.pojo.OplogInfoDO;
import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
public interface OpLogInfoMapper {

  List<OplogInfoDO> selectByPage(OplogInfoDO oplogInfoDO);

  void add(OplogInfoDO oplogInfoDO);
}

