package com.gk.entity.imgText;

import javax.persistence.*;

@Entity
@Table(name = "view_img_text_read_user_info", schema = "imgtext", catalog = "")
public class ViewImgTextReadUserInfo {
    private long classId;
    private long imgTextId;
    private long studentId;

    @Id
    @Column(name = "classId")
    public long getClassId() {
        return classId;
    }

    public void setClassId(long classId) {
        this.classId = classId;
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
    @Column(name = "studentId")
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewImgTextReadUserInfo that = (ViewImgTextReadUserInfo) o;

        if (classId != that.classId) return false;
        if (imgTextId != that.imgTextId) return false;
        if (studentId != that.studentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (classId ^ (classId >>> 32));
        result = 31 * result + (int) (imgTextId ^ (imgTextId >>> 32));
        result = 31 * result + (int) (studentId ^ (studentId >>> 32));
        return result;
    }
}
