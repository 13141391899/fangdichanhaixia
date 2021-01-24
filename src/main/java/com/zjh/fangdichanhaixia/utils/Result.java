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
    private static final Integer STATUS_FAILURE = 1;
    private static final Integer CODE_SUCCESS = 20000;
    private static final Integer CODE_FAILURE = -1;
    private Integer status;
    private Integer code;
    private String message;
    private T content;

    public Result success(T content, String msg) {
        Result<T> result = new Result<>();
        result.setMessage(msg);
        result.setContent(content);
        result.setStatus(STATUS_SUCCESS);
        result.setCode(CODE_SUCCESS);
        return result;
    }

    public Result failure(T content, String msg) {
        Result<T> result = new Result<>();
        result.setMessage(msg);
        result.setContent(content);
        result.setStatus(CODE_FAILURE);
        return result;
    }
}
