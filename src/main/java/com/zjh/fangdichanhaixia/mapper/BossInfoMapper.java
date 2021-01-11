package com.zjh.fangdichanhaixia.mapper;

import com.zjh.fangdichanhaixia.pojo.BossInfoDO;
import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
public interface BossInfoMapper {
  List<BossInfoDO> selectByPage(BossInfoDO bossInfoDO);

  void add(BossInfoDO bossInfoDO);

  void deleteBatch(@Param("bossIds") List<Integer> bossIds);

  void update(BossInfoDO bossInfoDO);

  BossInfoDO selectById(Integer bossId);

}
