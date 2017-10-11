package com.gk.entity.master;

import javax.persistence.*;

@Entity
@Table(name = "view_user_school_info", schema = "master", catalog = "master")
public class ViewUserSchoolInfo {
    private long userId;
    private String realName;
    private int schoolId;
    private String schoolName;
    private int addrCountyId;
    private String addrCountyName;
    private int addrCityId;
    private String addrCityName;
    private int addrProvinceId;
    private String addrProvinceName;

    @Id
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

    @Basic
    @Column(name = "addrCountyId")
    public int getAddrCountyId() {
        return addrCountyId;
    }

    public void setAddrCountyId(int addrCountyId) {
        this.addrCountyId = addrCountyId;
    }

    @Basic
    @Column(name = "addrCountyName")
    public String getAddrCountyName() {
        return addrCountyName;
    }

    public void setAddrCountyName(String addrCountyName) {
        this.addrCountyName = addrCountyName;
    }

    @Basic
    @Column(name = "addrCityId")
    public int getAddrCityId() {
        return addrCityId;
    }

    public void setAddrCityId(int addrCityId) {
        this.addrCityId = addrCityId;
    }

    @Basic
    @Column(name = "addrCityName")
    public String getAddrCityName() {
        return addrCityName;
    }

    public void setAddrCityName(String addrCityName) {
        this.addrCityName = addrCityName;
    }

    @Basic
    @Column(name = "addrProvinceId")
    public int getAddrProvinceId() {
        return addrProvinceId;
    }

    public void setAddrProvinceId(int addrProvinceId) {
        this.addrProvinceId = addrProvinceId;
    }

    @Basic
    @Column(name = "addrProvinceName")
    public String getAddrProvinceName() {
        return addrProvinceName;
    }

    public void setAddrProvinceName(String addrProvinceName) {
        this.addrProvinceName = addrProvinceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewUserSchoolInfo that = (ViewUserSchoolInfo) o;

        if (userId != that.userId) return false;
        if (schoolId != that.schoolId) return false;
        if (addrCountyId != that.addrCountyId) return false;
        if (addrCityId != that.addrCityId) return false;
        if (addrProvinceId != that.addrProvinceId) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (addrCountyName != null ? !addrCountyName.equals(that.addrCountyName) : that.addrCountyName != null)
            return false;
        if (addrCityName != null ? !addrCityName.equals(that.addrCityName) : that.addrCityName != null) return false;
        if (addrProvinceName != null ? !addrProvinceName.equals(that.addrProvinceName) : that.addrProvinceName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + schoolId;
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + addrCountyId;
        result = 31 * result + (addrCountyName != null ? addrCountyName.hashCode() : 0);
        result = 31 * result + addrCityId;
        result = 31 * result + (addrCityName != null ? addrCityName.hashCode() : 0);
        result = 31 * result + addrProvinceId;
        result = 31 * result + (addrProvinceName != null ? addrProvinceName.hashCode() : 0);
        return result;
    }
}
