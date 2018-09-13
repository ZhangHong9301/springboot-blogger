package com.homework.springbootblogger.controller;

import com.homework.springbootblogger.common.ResultEnum;
import com.homework.springbootblogger.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-13 11:45
 */
@Slf4j
@RestController
public class UserController {

    @GetMapping("/test")
    public String testException(){
        if(true){
            throw new MyException(ResultEnum.SMS_VERIFY_ERROR);
        }
        return "MyException";
    }
}
