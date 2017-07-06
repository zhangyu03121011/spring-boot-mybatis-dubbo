package com.uib.pbyt.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.uib.pbyt.mapper.ChannelMapper;

@Service
@Transactional(readOnly = true)
public class ChannelService implements IChannelService {

	private static Logger logger = LoggerFactory.getLogger(ChannelService.class);

	@Reference
	private IChannelMemberService channelMemberService;

	@Autowired
	private ChannelMapper channelDao;

	public Map<String, Object> queryFirstOffice(String openId) {
		Map<String, Object> mapInfo = new HashMap<String, Object>();
		if (StringUtils.isEmpty(openId)) {
			logger.info("openId入参为空");
			return mapInfo;
		}
		try {
			Map<String, Object> userMap = channelMemberService.findChannelIdByOpenId(openId);
			if (userMap != null && userMap.get("channelId") != null && !"".equals(userMap.get("channelId"))) {
				mapInfo = channelDao.findOfficeAndAreaByChannelId((String) userMap.get("channelId"));
				mapInfo.put("areaCode", userMap.get("areaCode"));
				logger.info("mapInfo====" + JSONObject.toJSONString(mapInfo));
			}
		} catch (Exception e) {
			logger.info("查询机构异常" + e.getMessage());
		}
		return mapInfo;
	}

}
