package com.homework.springbootblogger.service;

import com.homework.springbootblogger.model.User;

import java.util.List;
import java.util.Map;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-27 15:48
 */
public interface IUserService {

    List<User> findAllUser(int pageNum, int pageSize);

    List<User> getAllUser();

    User findUserById(Integer id);
}
