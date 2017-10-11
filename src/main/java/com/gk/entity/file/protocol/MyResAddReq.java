package com.gk.entity.file.protocol;

import java.util.List;

public class MyResAddReq
{

    private List<Long> listClassId;
    private Integer courseId;
    private String title;
    private String content;
    private Long fileId;
    private Long dirId;

    public Long getDirId()
    {
        return dirId;
    }

    public void setDirId(Long dirId)
    {
        this.dirId = dirId;
    }

    public List<Long> getListClassId()
    {
        return listClassId;
    }

    public void setListClassId(List<Long> listClassId)
    {
        this.listClassId = listClassId;
    }

    public Integer getCourseId()
    {
        return courseId;
    }

    public void setCourseId(Integer courseId)
    {
        this.courseId = courseId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public Long getFileId()
    {
        return fileId;
    }

    public void setFileId(Long fileId)
    {
        this.fileId = fileId;
    }
}