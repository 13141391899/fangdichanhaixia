package com.zjh.fangdichanhaixia.utils;

import com.github.pagehelper.Page;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zhao JianHong
 * @date 2020/12/30
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageList<T> {
  private Integer pageSize;
  private Integer pageNum;
  private Integer totalCount;
  private T data;

  public PageList(Page<T> page) {
    this.pageSize = page.getPageSize();
    this.pageNum = page.getPageNum();
    this.totalCount = Math.toIntExact(page.getTotal());
    this.data = (T) page.getResult();
  }
}
