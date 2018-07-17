package com.wnf.springbootmybatisdemo01.util;

public class ResultDto {
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public ResultDto(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResultDto(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public ResultDto() {

    }

    public static ResultDto ok(Object data) {
        return new ResultDto(data);
    }

    public static ResultDto ok() {
        return new ResultDto(null);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
