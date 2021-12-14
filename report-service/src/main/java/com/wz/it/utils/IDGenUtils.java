package com.wz.it.utils;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

/**
 * ID生成工具类
 *
 * @author zhaowangquan
 * @since 2021/7/14 5:44 下午
 */
public final class IDGenUtils implements Utilsable {

    /**
     * 生成UUID
     * @return 返回UUID字符串，默认替换调原"-"分隔符
     */
    public static String uuid() {
        return uuid("");
    }

    /**
     * 生成UUID
     * @param regex 返回UUID字符串，原"-"替换成指定regex分隔符
     * @return
     */
    public static String uuid(String regex) {
        return UUID.randomUUID().toString().replaceAll("-", regex);
    }

    /**
     * 将结果MD5加密后返回字符串
     * @param data
     * @return
     */
    public static String md5Hex(String data) {
        return DigestUtils.md5Hex(data);
    }
}
