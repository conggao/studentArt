package com.gk.model.area;

public class Nation {
    private Integer id;

    private String name;

    private String pinyinFull;

    private String pinyinFullBlank;

    private String pinyinShort;

    public Nation(Integer id, String name, String pinyinFull, String pinyinFullBlank, String pinyinShort) {
        this.id = id;
        this.name = name;
        this.pinyinFull = pinyinFull;
        this.pinyinFullBlank = pinyinFullBlank;
        this.pinyinShort = pinyinShort;
    }

    public Nation() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyinFull() {
        return pinyinFull;
    }

    public void setPinyinFull(String pinyinFull) {
        this.pinyinFull = pinyinFull;
    }

    public String getPinyinFullBlank() {
        return pinyinFullBlank;
    }

    public void setPinyinFullBlank(String pinyinFullBlank) {
        this.pinyinFullBlank = pinyinFullBlank;
    }

    public String getPinyinShort() {
        return pinyinShort;
    }

    public void setPinyinShort(String pinyinShort) {
        this.pinyinShort = pinyinShort;
    }
}