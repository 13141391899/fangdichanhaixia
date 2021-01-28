package com.zjh.fangdichanhaixia.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zjh.fangdichanhaixia.enums.EnumInterface;
import com.zjh.fangdichanhaixia.mapper.OpLogInfoMapper;
import com.zjh.fangdichanhaixia.pojo.OplogInfoDO;
import com.zjh.fangdichanhaixia.pojo.PayInfoDO;
import com.zjh.fangdichanhaixia.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
@Service
@Transactional
public class OpLogInfoService {
  @Autowired
  private OpLogInfoMapper opLogInfoMapper;

  public PageList<OplogInfoDO> selectByPage(OplogInfoDO oplogInfoDO) {
    PageHelper.startPage(oplogInfoDO.getPageNum(), oplogInfoDO.getPageSize());
    Page<OplogInfoDO> page = (Page<OplogInfoDO>) opLogInfoMapper.selectByPage(oplogInfoDO);
    page.getResult().forEach(item -> {
      item.setTypeStr(EnumInterface.OpType.getNameByCode(item.getType()));
    });
    return new PageList<>(page);
  }

  public void add(OplogInfoDO oplogInfoDO) {
    opLogInfoMapper.add(oplogInfoDO);
  }

}
