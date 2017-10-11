package com.gk.entity.file.protocol;

public class MyResDirReq {
    // 模糊查询操作
    private String condition;
    // 新建文件夹父目录id
    private Long parentId;
    // 文件夹名字
    private String name;
    // 共享文件夹操作
    private boolean share;


    public boolean isShare() {
        return share;
    }

    public void setShare(boolean share) {
        this.share = share;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
