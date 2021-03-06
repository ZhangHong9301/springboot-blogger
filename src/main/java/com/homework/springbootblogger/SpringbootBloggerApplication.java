package com.homework.springbootblogger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.homework.springbootblogger.mapper")
@EnableCaching
public class SpringbootBloggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBloggerApplication.class, args);
	}
}
