package com.gk.entity.imgText.protocol;

/**
 * ImgTextOptReq
 * @author 高聪 
 * 操作请求
 */
public class ImgTextOptReq implements java.io.Serializable {
	private Long id;
	private String content;
	private Long imgTextId;

	public Long getImgTextId() {
		return imgTextId;
	}

	public void setImgTextId(Long imgTextId) {
		this.imgTextId = imgTextId;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}