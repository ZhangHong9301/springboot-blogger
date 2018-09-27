package com.homework.springbootblogger.model;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-27 15:32
 */
@Data
public class User {
    private Integer id;
    private String email;
    private String sso_id;
    private String password;
    private String enable;
    private String account;
    private String credentials;
    private String locked;
    private Timestamp create_time;
    private String last_time;
    private String salt;
}
