package com.homework.springbootblogger.exception;

import com.homework.springbootblogger.common.IResultEnum;
import com.homework.springbootblogger.common.ResultEnum;
import com.homework.springbootblogger.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-13 15:17
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Throwable.class)
    public R defaultErrorHandler(HttpServletRequest req, Throwable e) {

        log.error("------------------>捕捉到全局异常", e);

        log.error(e.getMessage(),e);

        return R.FAILURE;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public R jsonErrorHandler(HttpServletRequest req, MyException e) {

        IResultEnum iResultEnum = e.getResultEnum();
        if (iResultEnum == null){

        }

        if (e.getCause() !=null){
            log.error(e.getMessage(),e);
        }
        //TODO 错误日志处理
        return new R(iResultEnum,e.getData());

    }
}
