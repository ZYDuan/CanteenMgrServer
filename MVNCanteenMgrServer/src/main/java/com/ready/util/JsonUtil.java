package com.ready.util;

import org.json.JSONObject;

public class JsonUtil {

    /**
     * @param: [key, value]
     * @return：java.lang.String
     * @author: zyd
     * @description: 将对象变成json格式
     * @create: 2018/6/15
     */
    public static String parseToJson(Object value) {
        JSONObject result = new JSONObject(value);
        return result.toString();
    }
}
