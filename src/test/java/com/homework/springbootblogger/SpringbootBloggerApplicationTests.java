package com.homework.springbootblogger;

import com.homework.springbootblogger.exception.MyException;
import com.homework.springbootblogger.model.User;
import com.homework.springbootblogger.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootBloggerApplicationTests {

	@Resource
	IUserService userService;


	@Resource
	RedisTemplate<String,User> userRedisTemplate;
	@Test
	public void contextLoads() {
	}


	/*@Test
	public void test02(){
		User user = userService.findUserById(39);
		//System.out.println(empById);
		//默认如果保存对象使用jdk序列化机制，序列化后的数据保存到Redis中
		//redisTemplate.opsForValue().set("emp-01",empById);
		//1、
		//2、redisTemplate 默认的序列化规则
		userRedisTemplate.opsForValue().set("emp-01",user);
		User user1 = userRedisTemplate.opsForValue().get("emp-01");
		System.out.println(user1);

	}*/

}
