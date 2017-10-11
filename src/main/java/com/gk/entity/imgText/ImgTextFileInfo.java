package com.gk.entity.imgText;

import javax.persistence.*;

@Entity
@Table(name = "img_text_file_info", schema = "imgtext", catalog = "")
public class ImgTextFileInfo {
    private long id;
    private long imgTextId;
    private long fileId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImgTextFileInfo that = (ImgTextFileInfo) o;

        if (id != that.id) return false;
        if (imgTextId != that.imgTextId) return false;
        if (fileId != that.fileId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (imgTextId ^ (imgTextId >>> 32));
        result = 31 * result + (int) (fileId ^ (fileId >>> 32));
        return result;
    }
}
