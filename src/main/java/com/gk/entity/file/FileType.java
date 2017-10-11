package com.gk.entity.file;

import javax.persistence.*;

@Entity
@Table(name = "file_type", schema = "file", catalog = "file")
public class FileType {
    private int id;
    private String name;

    public FileType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public FileType() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FileType fileType = (FileType) o;

        if (id != fileType.id) return false;
        if (name != null ? !name.equals(fileType.name) : fileType.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
