package com.gk.entity.master;

import javax.persistence.*;

@Entity
@Table(name = "view_user_teacher_info", schema = "master", catalog = "master")
public class ViewUserTeacherInfo {
    private long id;
    private long userId;
    private String realName;
    private int gradeNo;
    private String gradeName;
    private int classNo;
    private int courseId;
    private String courseName;

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
    @Column(name = "realName")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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
    @Column(name = "gradeName")
    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
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

    @Basic
    @Column(name = "courseName")
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewUserTeacherInfo that = (ViewUserTeacherInfo) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (gradeNo != that.gradeNo) return false;
        if (classNo != that.classNo) return false;
        if (courseId != that.courseId) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (gradeName != null ? !gradeName.equals(that.gradeName) : that.gradeName != null) return false;
        if (courseName != null ? !courseName.equals(that.courseName) : that.courseName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + gradeNo;
        result = 31 * result + (gradeName != null ? gradeName.hashCode() : 0);
        result = 31 * result + classNo;
        result = 31 * result + courseId;
        result = 31 * result + (courseName != null ? courseName.hashCode() : 0);
        return result;
    }
}
