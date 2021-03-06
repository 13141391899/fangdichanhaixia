package com.zjh.fangdichanhaixia.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zjh.fangdichanhaixia.enums.EnumInterface;
import com.zjh.fangdichanhaixia.mapper.HouseInfoMapper;
import com.zjh.fangdichanhaixia.pojo.HouseInfoDO;
import com.zjh.fangdichanhaixia.utils.PageList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Zhao JianHong
 * @date 2020/12/21
 */
@Service
@Transactional
public class HouseInfoService {
  @Autowired
  private HouseInfoMapper houseInfoMapper;

  public PageList<HouseInfoDO> selectByPage(HouseInfoDO houseInfoDO) {
    PageHelper.startPage(houseInfoDO.getPageNum(), houseInfoDO.getPageSize());
    Page<HouseInfoDO> page = (Page<HouseInfoDO>) houseInfoMapper.selectByPage(houseInfoDO);
    page.getResult().forEach(item-> {
      item.setRentedTypeStr(EnumInterface.RentType.getNameByCode(item.getRentedType()));
      item.setPayorTypeStr(EnumInterface.PayRentType.getNameByCode(item.getPayorType()));
    });
    return new PageList<>(page);
  }

  public void add(HouseInfoDO houseInfoDO) {
    houseInfoMapper.add(houseInfoDO);
  }

  public void deleteBatch(List<Integer> bossIds) {
    houseInfoMapper.deleteBatch(bossIds);
  }

  public void update(HouseInfoDO houseInfoDO) {
    houseInfoMapper.update(houseInfoDO);
  }

  public HouseInfoDO selectById(Integer bossId) {
    return houseInfoMapper.selectById(bossId);
  }
}
