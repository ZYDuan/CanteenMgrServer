package com.ready.util;

public class CodeUtil {

    //响应状态码
    //成功响应状态码
    public static int SUCCESS_CODE = 200;
    //响应失败状态码
    public static int FAILE_CODE = 100;

    //响应返回信息
    public static String SUCCESS_MSG = "响应成功";
    public static String FAILE_MSG = "响应失败";
    public static String REQUEST_FAIL = "请求信息不准确";

    // token时间过期
    public static int JWT_ERRCODE_EXPIRE = 701;

    // token验证失败
    public static int JWT_ERRCODE_FAIL = 702;

    // token验证成功
    public static int JWT_SUCCESS = 600;
}
