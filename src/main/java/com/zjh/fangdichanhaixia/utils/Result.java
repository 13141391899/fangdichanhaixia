package com.zjh.fangdichanhaixia.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private static final Integer STATUS_SUCCESS = 1;
    private final Integer STATUS_FAILURE = 1;
    private Integer status;
    private String msg;
    private T content;

    public Result success(T content, String msg) {
        Result<T> result = new Result<>();
        result.setMsg(msg);
        result.setContent(content);
        result.setStatus(STATUS_SUCCESS);
        return result;
    }

    public Result failure(T content, String msg) {
        Result<T> result = new Result<>();
        result.setMsg(msg);
        result.setContent(content);
        result.setStatus(STATUS_FAILURE);
        return result;
    }
}
