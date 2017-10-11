package com.gk.entity.imgText;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "img_text_top_info", schema = "imgtext", catalog = "")
public class ImgTextTopInfo {
    private long imgTextId;
    private Timestamp createTime;

    @Id
    @Column(name = "imgTextId")
    public long getImgTextId() {
        return imgTextId;
    }

    public void setImgTextId(long imgTextId) {
        this.imgTextId = imgTextId;
    }

    @Basic
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImgTextTopInfo that = (ImgTextTopInfo) o;

        if (imgTextId != that.imgTextId) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (imgTextId ^ (imgTextId >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
