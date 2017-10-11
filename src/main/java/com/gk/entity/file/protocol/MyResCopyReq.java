package com.gk.entity.file.protocol;

import java.util.List;

public class MyResCopyReq {
	private Long desId;
	private List<Long> dirList;
	private List<Long> resList;
	public Long getDesId() {
		return desId;
	}
	public void setDesId(Long desId) {
		this.desId = desId;
	}
	public List<Long> getDirList() {
		return dirList;
	}
	public void setDirList(List<Long> dirList) {
		this.dirList = dirList;
	}
	public List<Long> getResList() {
		return resList;
	}
	public void setResList(List<Long> resList) {
		this.resList = resList;
	}
	
}
