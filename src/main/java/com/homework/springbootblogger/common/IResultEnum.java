package com.homework.springbootblogger.common;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-13 16:20
 */
public interface IResultEnum {
    /**
     * 返回码
     *
     * @return
     */
    int code();

    /**
     * 返回文本信息
     *
     * @return
     */
    String msg();
}
