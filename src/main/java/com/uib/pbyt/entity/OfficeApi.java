package com.uib.pbyt.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class OfficeApi implements Serializable{
    
	private static final long serialVersionUID = 1L;
	
	 private String id;                 //编号
	 private String parentId;           //父级编号
	 private String parentIds;          //所有父级编号
	 private String name;               //名称
     private BigDecimal sort;           //排序
     private String provinceName;       //省名称
     private String provinceCode;       //省编码
     private String cityName;           //市名称
     private String cityCode;           //市编码
     private String type;               //机构类型
     private String category;           //机构类别（）
     private String grade;              //机构等级
     private String address;            //联系地址
     private String zipCode;            //邮政编码
     private String  master;            //负责人
     private String phone;              //电话
     private String fax;                //传真
     private String email;              //邮箱
     private String USEABLE;            //是否启用
     private String PRIMARY_PERSON;     //主负责人
     private String DEPUTY_PERSON;      //副负责人
     private String createBy;           //创建者
     private Date createDate;           //创建时间
     private String updateBy;           //更新者
     private Date updateDate;           //更新时间
     private String remarks;            //备注信息
     private String delFlag;            //删除标记
     private String countyName;         //区名称
     private String  countyCode;        //区编码
     
     private OfficeApi parent;          //上级机构
	
     private String condition;			//经济
     private String proxy;				//代理
     
	public OfficeApi getParent() {
		return parent;
	}
	public void setParent(OfficeApi parent) {
		this.parent = parent;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getParentIds() {
		return parentIds;
	}
	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSort() {
		return sort;
	}
	public void setSort(BigDecimal sort) {
		this.sort = sort;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUSEABLE() {
		return USEABLE;
	}
	public void setUSEABLE(String uSEABLE) {
		USEABLE = uSEABLE;
	}
	public String getPRIMARY_PERSON() {
		return PRIMARY_PERSON;
	}
	public void setPRIMARY_PERSON(String pRIMARY_PERSON) {
		PRIMARY_PERSON = pRIMARY_PERSON;
	}
	public String getDEPUTY_PERSON() {
		return DEPUTY_PERSON;
	}
	public void setDEPUTY_PERSON(String dEPUTY_PERSON) {
		DEPUTY_PERSON = dEPUTY_PERSON;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	public String getCountyName() {
		return countyName;
	}
	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}
	public String getCountyCode() {
		return countyCode;
	}
	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getProxy() {
		return proxy;
	}
	public void setProxy(String proxy) {
		this.proxy = proxy;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
     
     
}
