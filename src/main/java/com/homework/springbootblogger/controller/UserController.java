package com.homework.springbootblogger.controller;

import com.homework.springbootblogger.common.ResultEnum;
import com.homework.springbootblogger.exception.MyException;
import com.homework.springbootblogger.model.User;
import com.homework.springbootblogger.service.IUserService;
import com.homework.springbootblogger.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-13 11:45
 */
@Slf4j
@RestController
public class UserController {

    @Resource
    IUserService iUserService;

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



    /**
     * @Description: 分页查询
     * @param: [pageNum, pageSize]  
     * @Return: java.lang.Object
     * @Author: Mr.Zhang 
     * @Date: 2018/9/27 16:57
     */
    @GetMapping(value = "/user/{pageNum}/{pageSize}")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){


        Object userObject = iUserService.findAllUser(pageNum,pageSize);
        return R.turnR(userObject);
    }

    @GetMapping(value = "/user")
    public Object getAllUser(){

        Object userObject = iUserService.getAllUser();
        return R.turnR(userObject);
    }



}
