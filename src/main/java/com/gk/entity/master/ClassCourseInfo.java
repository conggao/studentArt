package com.gk.entity.master;

import javax.persistence.*;

@Entity
@Table(name = "class_course_info", schema = "master", catalog = "master")
public class ClassCourseInfo {
    private long id;
    private long classId;
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
    @Column(name = "classId")
    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
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

        ClassCourseInfo that = (ClassCourseInfo) o;

        if (id != that.id) return false;
        if (classId != that.classId) return false;
        if (courseId != that.courseId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (classId ^ (classId >>> 32));
        result = 31 * result + courseId;
        return result;
    }
}
