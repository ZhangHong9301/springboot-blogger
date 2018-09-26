package com.homework.springbootblogger.controller;

import com.homework.springbootblogger.common.ResultEnum;
import com.homework.springbootblogger.exception.MyException;
import com.homework.springbootblogger.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/test/{id}")
    public Object testException(@PathVariable("id") String id){
        if(id.equals("1")){
            String string = "test myException";
            log.info("================test myException");
            throw new MyException(ResultEnum.EXISTED_USER,string);
        }
        if (id.equals("2")){

            log.info("================test2 myException");
            throw new MyException(ResultEnum.PARAM_ERROR);
        }
        return R.OKR();
    }

    @GetMapping("/testGlobalException")
    public String testGlobalException() throws Exception {
        if(true){
            String string = "test myException";
            throw new Exception(string);
        }
        return "MyException";
    }




}
