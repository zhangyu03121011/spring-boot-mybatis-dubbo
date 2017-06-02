package com.uib.pbyt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.uib.pbyt.entity.OfficeApi;

@Mapper
public interface OfficeApiMapper{
    
	//根据id查询机构信息
	OfficeApi getOfficeApi(OfficeApi officeApi) throws Exception;
	
	/**
	 * 根据创客类型查询机构
	 * @param cond
	 * @return
	 */
	List<String> findListByCategory(OfficeApi officeApi) throws Exception;
}
