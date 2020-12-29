package com.zjh.fangdichanhaixia.utils;

public class Result<T> {
    private static final Integer STATUS_SUCCESS = 1;
    private final Integer STATUS_FAILURE = 1;
    private Integer status;
    private String msg;
    private T content;

    public Result success(T content, String msg) {
        Result<T> result = new Result<>();
        result.setMsg(msg + " 请求成功");
        result.setContent(content);
        result.setStatus(STATUS_SUCCESS);
        return result;
    }

    public Result failure(T content, String msg) {
        Result<T> result = new Result<>();
        result.setMsg(msg + " 请求失败");
        result.setContent(content);
        result.setStatus(STATUS_FAILURE);
        return result;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
