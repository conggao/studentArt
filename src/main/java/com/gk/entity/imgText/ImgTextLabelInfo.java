package com.gk.entity.imgText;

import javax.persistence.*;

@Entity
@Table(name = "img_text_label_info", schema = "imgtext", catalog = "")
public class ImgTextLabelInfo {
    private long id;
    private String name;
    private long createUserId;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "createUserId")
    public long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(long createUserId) {
        this.createUserId = createUserId;
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

        ImgTextLabelInfo that = (ImgTextLabelInfo) o;

        if (id != that.id) return false;
        if (createUserId != that.createUserId) return false;
        if (isDel != that.isDel) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (createUserId ^ (createUserId >>> 32));
        result = 31 * result + (isDel ? 1 : 0);
        return result;
    }
}
