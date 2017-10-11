package com.gk.entity.imgText;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "view_img_text_comment_info", schema = "imgtext", catalog = "")
public class ViewImgTextCommentInfo {
    private long id;
    private long imgTextId;
    private String content;
    private long createUserId;
    private Timestamp createTime;
    private boolean isDel;
    private String createUserName;
    private String createUserRealName;
    private String createUserHeadUrl;

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
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    @Column(name = "createTime")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "isDel")
    public boolean isDel() {
        return isDel;
    }

    public void setDel(boolean del) {
        isDel = del;
    }

    @Basic
    @Column(name = "createUserName")
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    @Basic
    @Column(name = "createUserRealName")
    public String getCreateUserRealName() {
        return createUserRealName;
    }

    public void setCreateUserRealName(String createUserRealName) {
        this.createUserRealName = createUserRealName;
    }

    @Basic
    @Column(name = "createUserHeadUrl")
    public String getCreateUserHeadUrl() {
        return createUserHeadUrl;
    }

    public void setCreateUserHeadUrl(String createUserHeadUrl) {
        this.createUserHeadUrl = createUserHeadUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewImgTextCommentInfo that = (ViewImgTextCommentInfo) o;

        if (id != that.id) return false;
        if (imgTextId != that.imgTextId) return false;
        if (createUserId != that.createUserId) return false;
        if (isDel != that.isDel) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUserName != null ? !createUserName.equals(that.createUserName) : that.createUserName != null)
            return false;
        if (createUserRealName != null ? !createUserRealName.equals(that.createUserRealName) : that.createUserRealName != null)
            return false;
        if (createUserHeadUrl != null ? !createUserHeadUrl.equals(that.createUserHeadUrl) : that.createUserHeadUrl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (imgTextId ^ (imgTextId >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (createUserId ^ (createUserId >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (isDel ? 1 : 0);
        result = 31 * result + (createUserName != null ? createUserName.hashCode() : 0);
        result = 31 * result + (createUserRealName != null ? createUserRealName.hashCode() : 0);
        result = 31 * result + (createUserHeadUrl != null ? createUserHeadUrl.hashCode() : 0);
        return result;
    }
}
