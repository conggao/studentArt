package com.gk.entity.imgText;

import javax.persistence.*;

@Entity
@Table(name = "img_text_base_label_info", schema = "imgtext", catalog = "")
public class ImgTextBaseLabelInfo {
    private long id;
    private long imgTextId;
    private long labelId;
    private long createUserId;

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
    @Column(name = "labelId")
    public long getLabelId() {
        return labelId;
    }

    public void setLabelId(long labelId) {
        this.labelId = labelId;
    }

    @Basic
    @Column(name = "createUserId")
    public long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(long createUserId) {
        this.createUserId = createUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImgTextBaseLabelInfo that = (ImgTextBaseLabelInfo) o;

        if (id != that.id) return false;
        if (imgTextId != that.imgTextId) return false;
        if (labelId != that.labelId) return false;
        if (createUserId != that.createUserId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (imgTextId ^ (imgTextId >>> 32));
        result = 31 * result + (int) (labelId ^ (labelId >>> 32));
        result = 31 * result + (int) (createUserId ^ (createUserId >>> 32));
        return result;
    }
}
