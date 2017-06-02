package com.uib.pbyt.service;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.alibaba.fastjson.JSONObject;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class ChannelServiceTest {
	@Autowired
	private ChannelService ChannelService;
	
	@Test
	public void testQueryFirstOffice() {
		Map<String, Object> queryFirstOffice = ChannelService.queryFirstOffice("fe6ab5ed13ea47c3a7c76367712d0813");
		System.out.println(JSONObject.toJSONString(queryFirstOffice));
	}
}
