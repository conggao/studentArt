package com.gk.entity.master;

import javax.persistence.*;

@Entity
@Table(name = "view_class_base_info", schema = "master", catalog = "")
public class ViewClassBaseInfo {
    private long id;
    private int gradeNo;
    private String className;
    private String gradeName;
    private int schoolId;
    private String schoolName;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "gradeNo")
    public int getGradeNo() {
        return gradeNo;
    }

    public void setGradeNo(int gradeNo) {
        this.gradeNo = gradeNo;
    }

    @Basic
    @Column(name = "className")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "gradeName")
    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
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
    @Column(name = "schoolName")
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewClassBaseInfo that = (ViewClassBaseInfo) o;

        if (id != that.id) return false;
        if (gradeNo != that.gradeNo) return false;
        if (schoolId != that.schoolId) return false;
        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (gradeName != null ? !gradeName.equals(that.gradeName) : that.gradeName != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + gradeNo;
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + (gradeName != null ? gradeName.hashCode() : 0);
        result = 31 * result + schoolId;
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        return result;
    }
}
