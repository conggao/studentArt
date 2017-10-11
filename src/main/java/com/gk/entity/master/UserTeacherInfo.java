package com.gk.entity.master;

import javax.persistence.*;

@Entity
@Table(name = "user_teacher_info", schema = "master", catalog = "master")
public class UserTeacherInfo {
    private long id;
    private long userId;
    private int gradeNo;
    private int classNo;
    private int courseId;

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

    @Basic
    @Column(name = "courseId")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserTeacherInfo that = (UserTeacherInfo) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (gradeNo != that.gradeNo) return false;
        if (classNo != that.classNo) return false;
        if (courseId != that.courseId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + gradeNo;
        result = 31 * result + classNo;
        result = 31 * result + courseId;
        return result;
    }
}
