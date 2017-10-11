package com.gk.entity.file.protocol;

import java.util.List;


public class DirListRsp {
	Long id;
	String name;
	List<DirListRsp> dirList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<DirListRsp> getDirList() {
		return dirList;
	}
	public void setDirList(List<DirListRsp> dirList) {
		this.dirList = dirList;
	}
    
}
