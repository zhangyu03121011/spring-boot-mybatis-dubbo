package com.uib.pbyt.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.uib.pbyt.entity.ChannelOffice;
import com.uib.pbyt.service.ChannelOfficeService;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@Transactional
@SpringBootTest
public class PbytFrontApplicationTests {
	
	@Autowired
	private ChannelOfficeService channelOfficeSevice;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testChannelOfficeService() throws Exception {
		ChannelOffice channelInfo = channelOfficeSevice.getChannelInfo("0385e931e41241e9a602d433c6008537");
		System.out.println(JSONObject.toJSON(channelInfo));
	}

}
