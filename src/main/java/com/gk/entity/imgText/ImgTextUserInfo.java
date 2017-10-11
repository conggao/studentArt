package com.gk.entity.imgText;

import javax.persistence.*;

@Entity
@Table(name = "img_text_user_info", schema = "imgtext", catalog = "")
public class ImgTextUserInfo {
    private long id;
    private long userId;
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
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

        ImgTextUserInfo that = (ImgTextUserInfo) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (imgTextId != that.imgTextId) return false;
        if (isDel != that.isDel) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (imgTextId ^ (imgTextId >>> 32));
        result = 31 * result + (isDel ? 1 : 0);
        return result;
    }
}
