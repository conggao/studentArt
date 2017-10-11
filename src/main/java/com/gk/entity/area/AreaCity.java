package com.gk.entity.area;

import javax.persistence.*;

@Entity
@Table(name = "area_city", schema = "area", catalog = "")
public class AreaCity {
    private int id;
    private String name;
    private String pinyinFull;
    private String pinyinFullBlank;
    private String pinyinShort;
    private int fatherId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "pinyinFull")
    public String getPinyinFull() {
        return pinyinFull;
    }

    public void setPinyinFull(String pinyinFull) {
        this.pinyinFull = pinyinFull;
    }

    @Basic
    @Column(name = "pinyinFullBlank")
    public String getPinyinFullBlank() {
        return pinyinFullBlank;
    }

    public void setPinyinFullBlank(String pinyinFullBlank) {
        this.pinyinFullBlank = pinyinFullBlank;
    }

    @Basic
    @Column(name = "pinyinShort")
    public String getPinyinShort() {
        return pinyinShort;
    }

    public void setPinyinShort(String pinyinShort) {
        this.pinyinShort = pinyinShort;
    }

    @Basic
    @Column(name = "fatherId")
    public int getFatherId() {
        return fatherId;
    }

    public void setFatherId(int fatherId) {
        this.fatherId = fatherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AreaCity areaCity = (AreaCity) o;

        if (id != areaCity.id) return false;
        if (fatherId != areaCity.fatherId) return false;
        if (name != null ? !name.equals(areaCity.name) : areaCity.name != null) return false;
        if (pinyinFull != null ? !pinyinFull.equals(areaCity.pinyinFull) : areaCity.pinyinFull != null) return false;
        if (pinyinFullBlank != null ? !pinyinFullBlank.equals(areaCity.pinyinFullBlank) : areaCity.pinyinFullBlank != null)
            return false;
        if (pinyinShort != null ? !pinyinShort.equals(areaCity.pinyinShort) : areaCity.pinyinShort != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pinyinFull != null ? pinyinFull.hashCode() : 0);
        result = 31 * result + (pinyinFullBlank != null ? pinyinFullBlank.hashCode() : 0);
        result = 31 * result + (pinyinShort != null ? pinyinShort.hashCode() : 0);
        result = 31 * result + fatherId;
        return result;
    }
}
