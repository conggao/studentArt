package com.gk.entity.imgText.protocol;

import java.util.List;

public class ImgTextListRsp
{

    private List<ImgTextSimpleRsp> list;
    private String                 updateTime;

    public List<ImgTextSimpleRsp> getList()
    {
        return list;
    }

    public void setList(List<ImgTextSimpleRsp> list)
    {
        this.list = list;
    }

    public String getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(String updateTime)
    {
        this.updateTime = updateTime;
    }

}