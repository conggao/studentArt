package com.gk.entity.file;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "dir_info", schema = "file", catalog = "file")
public class DirInfo {
    private Long id;
    private Long parentId;
    private String name;
    private Long createUserId;
    private Timestamp createTime;
    private int schoolId;
    private boolean isDel;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parentId")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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
    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
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
    @Column(name = "schoolId")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
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

        DirInfo dirInfo = (DirInfo) o;

        if (id != dirInfo.id) return false;
        if (createUserId != dirInfo.createUserId) return false;
        if (schoolId != dirInfo.schoolId) return false;
        if (isDel != dirInfo.isDel) return false;
        if (parentId != null ? !parentId.equals(dirInfo.parentId) : dirInfo.parentId != null) return false;
        if (name != null ? !name.equals(dirInfo.name) : dirInfo.name != null) return false;
        if (createTime != null ? !createTime.equals(dirInfo.createTime) : dirInfo.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (createUserId ^ (createUserId >>> 32));
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + schoolId;
        result = 31 * result + (isDel ? 1 : 0);
        return result;
    }
}
