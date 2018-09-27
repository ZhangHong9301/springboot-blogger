package com.homework.springbootblogger.mapper;

import com.homework.springbootblogger.model.User;

import java.util.List;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-26 15:18
 */
public interface UserMapper {

    List<User> selectAllUser();
}
