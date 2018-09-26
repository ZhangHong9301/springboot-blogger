package com.homework.springbootblogger.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.homework.springbootblogger.common.IResultEnum;
import com.homework.springbootblogger.common.ResultEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Getter
@Setter
public class R {

	private int code;
	private String msg;
	private Object data;

	/**
	 * 仅反馈成功，无详细数据，请用这个
	 */
	public static final R SUCCESS = new R(ResultEnum.SUCCESS);
	/**
	 * 未知错误，无详细数据，请用这个
	 */
	public static final R FAILURE = new R(ResultEnum.FAILURE);



	/**
	 * 异常码反馈
	 * @param iResultEnum
	 */
	public R(IResultEnum iResultEnum){
		this.code = iResultEnum.code();
		this.msg = iResultEnum.msg();
	}

	/**
	 * 异常时还需要数据的情况
	 * @param iResultEnum
	 * @param data
	 */
	public R(IResultEnum iResultEnum,Object data){
		this.code = iResultEnum.code();
		this.msg = iResultEnum.msg();
		this.data = data;
	}

	public R(Object data){
		this(ResultEnum.SUCCESS,data);
	}

	/**
	 * @Description: 成功消息
	 * @param: [object]
	 * @Return: java.lang.String
	 * @Author: Mr.Zhang
	 * @Date: 2018/9/26 10:43
	 */
	public static String turnR(Object object) throws JsonProcessingException {
		Map<String,Object> resMap = new HashMap<>();
		resMap.put("code", "200");
		resMap.put("msg", "操作成功");
		resMap.put("data", object);

		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		String result = mapper.writeValueAsString(resMap);
		log.info("返回结果：" + result);
		return result;
	}

	/**
	 * 成功消息
	 * @param
	 * @return
	 * @throws JsonProcessingException
	 */
	public static String OKR(){
		Map<String,Object> resMap = new HashMap<>();
		resMap.put("code", "200");
		resMap.put("msg", "操作成功");

		ObjectMapper mapper = new ObjectMapper();
		String result = null;
		try {
			result = mapper.writeValueAsString(resMap);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		log.info("返回结果：" + result);
		return result;
	}
}
	