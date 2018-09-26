package com.homework.springbootblogger.common;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-13 14:33
 */
public enum  ResultEnum implements IResultEnum{

    SUCCESS(200, "成功"),
    FAILURE(-1, "系统错误"),

    SAVE_ERROR(1, "保存失败!"),

    PARAM_ERROR(2, "参数错误!"),

    SMS_ERROR(3, "短信错误!"),

    SMS_TIMED_OUT_ERROR(4, "短信超时或验证码失效!"),

    SMS_VERIFY_ERROR(5, "验证码错误!"),

    EXISTED_USER(6, "该用户已存在!"),

    ORDER_GROUPOUT_ERROR(7, "xxx"),

    ORDER_USERREPEAT_ERROR(8, "您已参与该行程"),

    ORDER_TOTAL_ERROR(9, "总价不正确，请联系客服"),

    DELETE_ERROR(10, "删除失败");

    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int code(){
        return this.code;
    }

    @Override
    public String msg(){
        return this.message;
    }


    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
