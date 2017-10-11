package com.gk.entity.imgText;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "view_img_text_base_info", schema = "imgtext", catalog = "")
public class ViewImgTextBaseInfo {
    private long id;
    private Integer schoolId;
    private int type;
    private String typeName;
    private String title;
    private String content;
    private long createUserId;
    private Timestamp createTime;
    private Timestamp lastUpdateTime;
    private Integer praiseNum;
    private Integer commentNum;
    private boolean isDel;
    private String createUserName;
    private String createUserRealName;
    private String createUserHeadUrl;
    private Boolean isCanComment;
    private Boolean isCanReceipt;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "schoolId")
    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "typeName")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "lastUpdateTime")
    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Basic
    @Column(name = "praiseNum")
    public Integer getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    @Basic
    @Column(name = "commentNum")
    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
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

    @Basic
    @Column(name = "isCanComment")
    public Boolean getCanComment() {
        return isCanComment;
    }

    public void setCanComment(Boolean canComment) {
        isCanComment = canComment;
    }

    @Basic
    @Column(name = "isCanReceipt")
    public Boolean getCanReceipt() {
        return isCanReceipt;
    }

    public void setCanReceipt(Boolean canReceipt) {
        isCanReceipt = canReceipt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewImgTextBaseInfo that = (ViewImgTextBaseInfo) o;

        if (id != that.id) return false;
        if (type != that.type) return false;
        if (createUserId != that.createUserId) return false;
        if (isDel != that.isDel) return false;
        if (schoolId != null ? !schoolId.equals(that.schoolId) : that.schoolId != null) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (lastUpdateTime != null ? !lastUpdateTime.equals(that.lastUpdateTime) : that.lastUpdateTime != null)
            return false;
        if (praiseNum != null ? !praiseNum.equals(that.praiseNum) : that.praiseNum != null) return false;
        if (commentNum != null ? !commentNum.equals(that.commentNum) : that.commentNum != null) return false;
        if (createUserName != null ? !createUserName.equals(that.createUserName) : that.createUserName != null)
            return false;
        if (createUserRealName != null ? !createUserRealName.equals(that.createUserRealName) : that.createUserRealName != null)
            return false;
        if (createUserHeadUrl != null ? !createUserHeadUrl.equals(that.createUserHeadUrl) : that.createUserHeadUrl != null)
            return false;
        if (isCanComment != null ? !isCanComment.equals(that.isCanComment) : that.isCanComment != null) return false;
        if (isCanReceipt != null ? !isCanReceipt.equals(that.isCanReceipt) : that.isCanReceipt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (schoolId != null ? schoolId.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (createUserId ^ (createUserId >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (lastUpdateTime != null ? lastUpdateTime.hashCode() : 0);
        result = 31 * result + (praiseNum != null ? praiseNum.hashCode() : 0);
        result = 31 * result + (commentNum != null ? commentNum.hashCode() : 0);
        result = 31 * result + (isDel ? 1 : 0);
        result = 31 * result + (createUserName != null ? createUserName.hashCode() : 0);
        result = 31 * result + (createUserRealName != null ? createUserRealName.hashCode() : 0);
        result = 31 * result + (createUserHeadUrl != null ? createUserHeadUrl.hashCode() : 0);
        result = 31 * result + (isCanComment != null ? isCanComment.hashCode() : 0);
        result = 31 * result + (isCanReceipt != null ? isCanReceipt.hashCode() : 0);
        return result;
    }
}
