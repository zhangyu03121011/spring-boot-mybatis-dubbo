package com.uib.pbyt.mapper;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.uib.pbyt.entity.ChannelOffice;

@Mapper
public interface ChannelMapper{
	
	/**
	 * @Title: getChannelInfo 
	 * @Description: 获取渠道信息
	 * @param @param channelId
	 * @param @return
	 * @param @throws Exception
	 * @return ChannelOffice
	 * @throws
	 */
	public ChannelOffice getChannelInfo(@Param("channelId") String channelId) throws Exception;
	
	/**
	 * 查询机构和地区
	 * @param channelId
	 * @return
	 */
	public Map<String, Object> findOfficeAndAreaByChannelId(String channelId);
}