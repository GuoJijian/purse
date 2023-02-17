package com.guojijian.pethospital.commons.util;

import java.util.UUID;

/**
 * UUID工具类
 */
public class UUIDUtils {

    //获取UUID值
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
