package cn.wares.commodity.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname ReturnResult
 * @Description TODO
 * @Date 2020/12/24 14:55
 * @Created by 32999
 */
public class ReturnResult {
    /**
     * 成功返回
     * @return
     */
    public static Map<String,Object> returnSuccess(Object msg, Object data){
        Map<String,Object> map = new HashMap<>();
        map.put("Msg",msg);
        map.put("Code",200);
        map.put("Data",data);
        return map;
    }

    /**
     * 失败
     * @param msg   （返回信息）
     * @param data  （返回数据）
     * @param code  （返回编号）
     * @return
     */
    public static Map<String,Object> returnFail(Object msg,Object data,Object code){
        Map<String,Object> map = new HashMap<>();
        map.put("Msg",msg);
        map.put("Code",code);
        map.put("Data",data);
        return map;
    }
}
