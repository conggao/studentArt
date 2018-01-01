package com.gk.model.file;

import java.util.Date;

public class UploadFileInfo {
    private Long id;

    private String path;

    private Integer serverId;

    private String name;

    private Long size;

    private Integer type;

    private String ext;

    private Long userId;

    private Integer playTime;

    private Date time;

    private Boolean isdel;

    public UploadFileInfo(Long id, String path, Integer serverId, String name, Long size, Integer type, String ext, Long userId, Integer playTime, Date time, Boolean isdel) {
        this.id = id;
        this.path = path;
        this.serverId = serverId;
        this.name = name;
        this.size = size;
        this.type = type;
        this.ext = ext;
        this.userId = userId;
        this.playTime = playTime;
        this.time = time;
        this.isdel = isdel;
    }

    public UploadFileInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Boolean getIsdel() {
        return isdel;
    }

    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }
}