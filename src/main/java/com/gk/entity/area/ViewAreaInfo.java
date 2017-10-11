package com.gk.entity.area;

import javax.persistence.*;

@Entity
@Table(name = "view_area_info", schema = "area", catalog = "area")
public class ViewAreaInfo {
    private int countyId;
    private String countyName;
    private String provinceName;
    private String cityName;

    @Id
    @Column(name = "countyId")
    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    @Basic
    @Column(name = "countyName")
    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    @Basic
    @Column(name = "provinceName")
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Basic
    @Column(name = "cityName")
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewAreaInfo that = (ViewAreaInfo) o;

        if (countyId != that.countyId) return false;
        if (countyName != null ? !countyName.equals(that.countyName) : that.countyName != null) return false;
        if (provinceName != null ? !provinceName.equals(that.provinceName) : that.provinceName != null) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countyId;
        result = 31 * result + (countyName != null ? countyName.hashCode() : 0);
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }
}
