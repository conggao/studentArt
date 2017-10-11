package com.gk.entity.master;

import javax.persistence.*;

@Entity
@Table(name = "grade_info", schema = "master", catalog = "master")
public class GradeInfo {
    private int id;
    private int stageId;
    private String name;
    private String englishName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "stageId")
    public int getStageId() {
        return stageId;
    }

    public void setStageId(int stageId) {
        this.stageId = stageId;
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
    @Column(name = "englishName")
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GradeInfo gradeInfo = (GradeInfo) o;

        if (id != gradeInfo.id) return false;
        if (stageId != gradeInfo.stageId) return false;
        if (name != null ? !name.equals(gradeInfo.name) : gradeInfo.name != null) return false;
        if (englishName != null ? !englishName.equals(gradeInfo.englishName) : gradeInfo.englishName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + stageId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (englishName != null ? englishName.hashCode() : 0);
        return result;
    }
}
