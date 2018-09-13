package com.homework.springbootblogger.exception;

import com.homework.springbootblogger.common.IResultEnum;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-13 15:14
 */
public class MyException extends RuntimeException {

//    业务异常码
    private IResultEnum resultEnum;

    private Object data;

    public MyException(IResultEnum resultEnum){
        this.resultEnum = resultEnum;
    }

    public MyException(IResultEnum resultEnum,Object data){
        this(resultEnum);
        this.data = data;
    }

    public MyException(IResultEnum resultEnum,Throwable cause){
        super(cause);
        this.resultEnum = resultEnum;
    }

    public MyException(IResultEnum resultEnum,Object data,Throwable cause){
        this(resultEnum,cause);
        this.data = data;
    }

    public IResultEnum getResultEnum() {
        return resultEnum;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String getMessage() {
        return resultEnum == null ? null : resultEnum.msg();
    }
}
