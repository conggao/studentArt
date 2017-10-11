package com.gk.entity.imgText;

import javax.persistence.*;

@Entity
@Table(name = "img_text_class_info", schema = "imgtext", catalog = "")
public class ImgTextClassInfo {
    private long id;
    private long classId;
    private long imgTextId;
    private boolean isDel;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "classId")
    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
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
    @Column(name = "isDel")
    public boolean isDel() {
        return isDel;
    }

    public void setDel(boolean del) {
        isDel = del;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImgTextClassInfo that = (ImgTextClassInfo) o;

        if (id != that.id) return false;
        if (classId != that.classId) return false;
        if (imgTextId != that.imgTextId) return false;
        if (isDel != that.isDel) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (classId ^ (classId >>> 32));
        result = 31 * result + (int) (imgTextId ^ (imgTextId >>> 32));
        result = 31 * result + (isDel ? 1 : 0);
        return result;
    }
}
