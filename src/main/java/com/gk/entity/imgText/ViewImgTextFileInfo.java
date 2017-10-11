package com.gk.entity.imgText;

import javax.persistence.*;

@Entity
@Table(name = "view_img_text_file_info", schema = "imgtext", catalog = "")
public class ViewImgTextFileInfo {
    private long id;
    private long imgTextId;
    private long fileId;
    private String fileName;
    private String fileUrl;
    private Integer playTime;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "imgTextId")
    public long getImgTextId() {
        return imgTextId;
    }

    public void setImgTextId(long imgTextId) {
        this.imgTextId = imgTextId;
    }

    @Basic
    @Column(name = "fileId")
    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }

    @Basic
    @Column(name = "fileName")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "fileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Basic
    @Column(name = "playTime")
    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewImgTextFileInfo that = (ViewImgTextFileInfo) o;

        if (id != that.id) return false;
        if (imgTextId != that.imgTextId) return false;
        if (fileId != that.fileId) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        if (fileUrl != null ? !fileUrl.equals(that.fileUrl) : that.fileUrl != null) return false;
        if (playTime != null ? !playTime.equals(that.playTime) : that.playTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (imgTextId ^ (imgTextId >>> 32));
        result = 31 * result + (int) (fileId ^ (fileId >>> 32));
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        result = 31 * result + (fileUrl != null ? fileUrl.hashCode() : 0);
        result = 31 * result + (playTime != null ? playTime.hashCode() : 0);
        return result;
    }
}
