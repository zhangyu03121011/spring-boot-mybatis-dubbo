package com.mm.dev.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONObject;
import com.mm.dev.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testJpa() {
		try {
			userService.save();
//			System.out.println(JSONObject.toJSONString(userService.getUser(1L)));
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("保存异常",e);
		}
	}
	
	@Test
	public void testMybatis() {
		try {
			userService.saveUser();
			List<User> userList = userService.getUserList();
			System.out.println(JSONObject.toJSONString(userList));
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("保存异常",e);
		}
	}
}
