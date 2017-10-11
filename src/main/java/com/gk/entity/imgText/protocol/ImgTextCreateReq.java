package com.gk.entity.imgText.protocol;

import java.util.List;

public class ImgTextCreateReq
{
    private String     title;
    private String     content;
    private Integer    schoolId;
    private Boolean    isCanComment;
    private Boolean    isTop;
    private Boolean    isReceipt;
    private List<Long> listClassId;
    private List<Long> listFileId;
    private List<Long> listUserId;
    private List<Long> listLabelId;

    public List<Long> getListLabelId()
    {
        return listLabelId;
    }

    public void setListLabelId(List<Long> listLabelId)
    {
        this.listLabelId = listLabelId;
    }

    public Integer getSchoolId()
    {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId)
    {
        this.schoolId = schoolId;
    }

    public boolean getIsCanComment()
    {
        return isCanComment;
    }

    public boolean isTop()
    {
        return isTop;
    }

    public void setTop(boolean isTop)
    {
        this.isTop = isTop;
    }

    public boolean isReceipt()
    {
        return isReceipt;
    }

    public void setReceipt(boolean isReceipt)
    {
        this.isReceipt = isReceipt;
    }

    public void setIsCanComment(boolean isCanComment)
    {
        this.isCanComment = isCanComment;
    }

    public List<Long> getListUserId()
    {
        return listUserId;
    }

    public void setListUserId(List<Long> listUserId)
    {
        this.listUserId = listUserId;
    }

    public List<Long> getListClassId()
    {
        return listClassId;
    }

    public void setListClassId(List<Long> listClassId)
    {
        this.listClassId = listClassId;
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

    public List<Long> getListFileId()
    {
        return listFileId;
    }

    public void setListFileId(List<Long> listFileId)
    {
        this.listFileId = listFileId;
    }

}
