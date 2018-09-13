package com.homework.springbootblogger.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-13 15:38
 */
@Slf4j
@Controller
public class PageController {
    @GetMapping("/home")
    public String index(){
        log.info("======================> This is Home Page!");
        return "index";
    }
}
