package com.neusoft.his.entity;

public class User {
	private Integer id;
	private String userName;
	private String password;
	private String realName;
	private Integer useType;
	private Integer docTitleID;
	private String isScheduling;
	private Integer deptID;
	private Integer registLeID;
	private Integer delMark;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getUseType() {
		return useType;
	}
	public void setUseType(Integer useType) {
		this.useType = useType;
	}
	public Integer getDocTitleID() {
		return docTitleID;
	}
	public void setDocTitleID(Integer docTitleID) {
		this.docTitleID = docTitleID;
	}
	public String getIsScheduling() {
		return isScheduling;
	}
	public void setIsScheduling(String isScheduling) {
		this.isScheduling = isScheduling;
	}
	public Integer getDeptID() {
		return deptID;
	}
	public void setDeptID(Integer deptID) {
		this.deptID = deptID;
	}
	public Integer getRegistLeID() {
		return registLeID;
	}
	public void setRegistLeID(Integer registLeID) {
		this.registLeID = registLeID;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	
	public User() {
		super();
	}
	
	public User(Integer id, String userName, String password, String realName, Integer useType, Integer docTitleID,
			String isScheduling, Integer deptID, Integer registLeID, Integer delMark) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.realName = realName;
		this.useType = useType;
		this.docTitleID = docTitleID;
		this.isScheduling = isScheduling;
		this.deptID = deptID;
		this.registLeID = registLeID;
		this.delMark = delMark;
	}
	
	


}
