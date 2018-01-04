package com.gk.model.media;

import java.util.Date;

public class CoverInfo {
    private Long id;

    private Long movieId;

    private Long audioId;

    private Long fileId;

    private Date createTime;

    private Date updateTime;

    private Boolean isDel;

    public CoverInfo(Long id, Long movieId, Long audioId, Long fileId, Date createTime, Date updateTime, Boolean isDel) {
        this.id = id;
        this.movieId = movieId;
        this.audioId = audioId;
        this.fileId = fileId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDel = isDel;
    }

    public CoverInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getAudioId() {
        return audioId;
    }

    public void setAudioId(Long audioId) {
        this.audioId = audioId;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
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
}