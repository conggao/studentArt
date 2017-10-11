package com.gk.entity.schoolbase.protocol;

import java.sql.Timestamp;

public class AdminSchoolRsp {
	private Integer id;
	private Integer inviteCode;
	private String name;
	private String addr;
	private Timestamp createTime;
	private String account;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getInviteCode() {
		return inviteCode;
	}
	public void setInviteCode(Integer inviteCode) {
		this.inviteCode = inviteCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
}
