package com.zjh.fangdichanhaixia.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zjh.fangdichanhaixia.mapper.PayInfoMapper;
import com.zjh.fangdichanhaixia.pojo.PayInfoDO;
import com.zjh.fangdichanhaixia.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
@Service
public class PayInfoService {
  @Autowired
  private PayInfoMapper payInfoMapper;

  public PageList<PayInfoDO> selectByPage(PayInfoDO payInfoDO) {
    PageHelper.startPage(payInfoDO.getPageNum(), payInfoDO.getPageSize());
    Page<PayInfoDO> page = (Page<PayInfoDO>) payInfoMapper.selectByPage(payInfoDO);
    return new PageList<>(page);
  }

  public void add(PayInfoDO payInfoDO) {
    payInfoMapper.add(payInfoDO);
  }

  public void deleteBatch(List<Integer> bossIds) {
    payInfoMapper.deleteBatch(bossIds);
  }

  public void update(PayInfoDO payInfoDO) {
    payInfoMapper.update(payInfoDO);
  }

  public PayInfoDO selectById(Integer bossId) {
    return payInfoMapper.selectById(bossId);
  }
}
