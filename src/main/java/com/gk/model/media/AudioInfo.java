package com.gk.model.media;

import java.util.Date;

public class AudioInfo {
    private Long id;

    private Long fileId;

    private String title;

    private Date createTime;

    private Date updateTime;

    private Boolean isDel;

    private String introduction;

    public AudioInfo(Long id, Long fileId, String title, Date createTime, Date updateTime, Boolean isDel, String introduction) {
        this.id = id;
        this.fileId = fileId;
        this.title = title;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDel = isDel;
        this.introduction = introduction;
    }

    public AudioInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}