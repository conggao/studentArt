package com.gk.entity.master;

import javax.persistence.*;

@Entity
@Table(name = "class_base_info", schema = "master", catalog = "master")
public class ClassBaseInfo {
    private long id;
    private int schoolId;
    private int gradeNo;
    private int classNo;

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
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
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
    @Column(name = "classNo")
    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassBaseInfo that = (ClassBaseInfo) o;

        if (id != that.id) return false;
        if (schoolId != that.schoolId) return false;
        if (gradeNo != that.gradeNo) return false;
        if (classNo != that.classNo) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + schoolId;
        result = 31 * result + gradeNo;
        result = 31 * result + classNo;
        return result;
    }
}
