package com.ready.common;

import java.util.HashMap;

/**
 * @program: MVNCanteenMgr
 * @author: zyd
 * @description: 响应数据格式
 * @create: 2018-06-14 12:43
 */

public class CommonResponse {

    public CommonResponse(){};

    public CommonResponse(int status, String msg){
        this.status = status;
        this.msg = msg;
    }
    public CommonResponse(int status, Object data, String msg){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    //响应状态码
    private int status;

    //响应数据
    private Object data;

    //响应信息
    private String msg;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
