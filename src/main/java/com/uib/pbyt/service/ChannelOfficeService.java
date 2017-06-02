/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/easypay/epay">epay</a> All rights reserved.
 */
package com.uib.pbyt.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.uib.pbyt.entity.ChannelOffice;
import com.uib.pbyt.entity.OfficeApi;
import com.uib.pbyt.mapper.ChannelMapper;
import com.uib.pbyt.mapper.OfficeApiMapper;
import com.uib.pbyt.service.IChannelOfficeService;
import com.uib.pbyt.service.IMemMemberService;
/**
 * 渠道机构关联表Service
 * @author luoxf
 * @version 2017-03-28
 */
@com.alibaba.dubbo.config.annotation.Service
public class ChannelOfficeService implements IChannelOfficeService {
	
	Logger logger = LoggerFactory.getLogger(ChannelOfficeService.class);

	@Autowired
	private ChannelMapper channelDao;
	
	@Autowired
	private OfficeApiMapper officeApiDao;
	
	@Reference
	private IMemMemberService memberService;
	
	/**
	 * 通过渠道ID查询渠道机构关联信息
	 */
	public ChannelOffice getChannelInfo(String channelId) throws Exception{
		ChannelOffice channelInfo = null;
		try {
			logger.info("通过渠道ID查询渠道机构关联信息参数channelId==={}",channelId);
			channelInfo = channelDao.getChannelInfo(channelId);
		} catch (Exception e) {
			logger.error("通过渠道ID查询渠道机构关联信息异常error==={}",e);
		}
		return channelInfo;
	}
	
	/**
	 * 根据openId查询用户创客类型，根据创客类型查询所有机构
	 * @param openId
	 * @return
	 */
	public List<String> getOfficeApiListByOpenId(String openId) throws Exception{
		List<String> officeApiList = null;
		try {
			logger.info("根据openId查询用户创客类型，根据创客类型查询所有机构参数openId==={}",openId);
			Map<String, Object> queryMemMember = memberService.queryMemMember(openId, null);
			if(null != queryMemMember) {
				//获取用户注册的创客类型（创客类型（0代表没选中，1代表选中；第一位：经纪，第二位：代理，第三位：公估，第四位：电商））
				String makerType = (String)queryMemMember.get("makerType");
				if(StringUtils.isNotEmpty(makerType)) {
					String[] makerTypeArr = makerType.split(",");
					if(null != makerTypeArr) {
						OfficeApi officeApi = new OfficeApi();
						if(makerTypeArr.length > 0 && "1".equals(makerTypeArr[0])) {
							officeApi.setCondition(makerTypeArr[0]);
						}
						if(makerTypeArr.length > 1 && "1".equals(makerTypeArr[1])) {
							officeApi.setProxy(makerTypeArr[1]);
						}
						//根据创客类型查询机构
						officeApiList = officeApiDao.findListByCategory(officeApi);
					}
				}
			}
		} catch (Exception e) {
			logger.error("根据openId查询用户创客类型，根据创客类型查询所有机构异常error==={}",e);
		}
		return officeApiList;
	}
}