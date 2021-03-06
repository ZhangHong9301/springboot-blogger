package com.homework.springbootblogger.service.impl;

import com.github.pagehelper.PageHelper;
import com.homework.springbootblogger.common.ResultEnum;
import com.homework.springbootblogger.exception.MyException;
import com.homework.springbootblogger.mapper.UserMapper;
import com.homework.springbootblogger.model.User;
import com.homework.springbootblogger.service.IUserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springboot-blogger
 * @description: ${description}
 * @author: Mr.Zhang
 * @create: 2018-09-27 15:50
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements IUserService {

    @Resource
    UserMapper userMapper;

    @Override
    @Cacheable(condition = "#pageNum>0")
    public List<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.selectAllUser();
        if (userList == null || userList.isEmpty()){
            throw new MyException(ResultEnum.PARAM_ERROR);
        }
        return userList;
    }



    @Override
    @Cacheable
    public List<User> getAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User findUserById(Integer Id) {
        return userMapper.selectUserById(Id);
    }
}
