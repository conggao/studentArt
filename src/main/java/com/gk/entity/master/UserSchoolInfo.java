package com.gk.entity.master;

import javax.persistence.*;

@Entity
@Table(name = "user_school_info", schema = "master", catalog = "master")
public class UserSchoolInfo {
    private long userId;
    private int schoolId;

    @Id
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "schoolId")
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSchoolInfo that = (UserSchoolInfo) o;

        if (userId != that.userId) return false;
        if (schoolId != that.schoolId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + schoolId;
        return result;
    }
}
