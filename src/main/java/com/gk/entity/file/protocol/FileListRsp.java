package com.gk.entity.file.protocol;

import java.util.List;


public class FileListRsp {
	Long id;
	String name;
	List<FileListRsp> fileList;
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
	public List<FileListRsp> getFileList() {
		return fileList;
	}
	public void setFileList(List<FileListRsp> fileList) {
		this.fileList = fileList;
	}
	
	

}
