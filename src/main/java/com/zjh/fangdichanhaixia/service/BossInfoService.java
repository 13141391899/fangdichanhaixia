package com.zjh.fangdichanhaixia.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zjh.fangdichanhaixia.mapper.BossInfoMapper;
import com.zjh.fangdichanhaixia.mapper.RoomInfoMapper;
import com.zjh.fangdichanhaixia.pojo.BossInfoDO;
import com.zjh.fangdichanhaixia.pojo.RoomInfoDO;
import com.zjh.fangdichanhaixia.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
@Service
@Transactional
public class BossInfoService {
  @Autowired
  private BossInfoMapper bossInfoMapper;

  public PageList<BossInfoDO> selectByPage(BossInfoDO bossInfoDO) {
    PageHelper.startPage(bossInfoDO.getPageNum(), bossInfoDO.getPageSize());
    Page<BossInfoDO> page = (Page<BossInfoDO>) bossInfoMapper.selectByPage(bossInfoDO);
    return new PageList<>(page);
  }

  public void add(BossInfoDO bossInfoDO) {
    bossInfoDO.setCreatorName("王海霞");
    bossInfoDO.setUpdatorName("王海霞");
    bossInfoDO.setUpdateTime(new Date());
    bossInfoMapper.add(bossInfoDO);
  }

  public void deleteBatch(List<Integer> bossIds) {
    bossInfoMapper.deleteBatch(bossIds);
  }

  public void update(BossInfoDO bossInfoDO) {
    bossInfoMapper.update(bossInfoDO);
  }

  public BossInfoDO selectById(Integer bossId) {
    return bossInfoMapper.selectById(bossId);
  }
}
