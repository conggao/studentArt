package com.gk.entity.imgText.protocol;


import com.gk.entity.imgText.ViewImgTextBaseInfo;
import com.gk.entity.imgText.ViewImgTextFileInfo;

import java.util.List;


public class ImgTextSimpleRsp
{

    private ViewImgTextBaseInfo base;
    private List<ViewImgTextFileInfo> listFile;
    private boolean                   isPraise;
    private boolean                   isComment;
    private boolean                   isRead;

    public boolean isRead()
    {
        return isRead;
    }

    public void setRead(boolean isRead)
    {
        this.isRead = isRead;
    }

    public ViewImgTextBaseInfo getBase()
    {
        return base;
    }

    public void setBase(ViewImgTextBaseInfo base)
    {
        this.base = base;
    }

    public List<ViewImgTextFileInfo> getListFile()
    {
        return listFile;
    }

    public void setListFile(List<ViewImgTextFileInfo> listFile)
    {
        this.listFile = listFile;
    }

    public boolean isPraise()
    {
        return isPraise;
    }

    public void setPraise(boolean isPraise)
    {
        this.isPraise = isPraise;
    }

    public boolean isComment()
    {
        return isComment;
    }

    public void setComment(boolean isComment)
    {
        this.isComment = isComment;
    }

   
}