package com.gk.entity.file.protocol;

import com.gk.entity.file.ViewUserDirInfo;
import com.gk.entity.file.ViewUserResInfo;

import java.util.List;

public class MyResDirListRsp
{
    private Long                  grandId;
    private Long                  parentId;
    private List<ViewUserDirInfo> dirList;
    private List<ViewUserResInfo> resList;

    public Long getParentId()
    {
        return parentId;
    }

    public void setParentId(Long parentId)
    {
        this.parentId = parentId;
    }

    public Long getGrandId()
    {
        return grandId;
    }

    public void setGrandId(Long grandId)
    {
        this.grandId = grandId;
    }

    public List<ViewUserDirInfo> getDirList()
    {
        return dirList;
    }

    public void setDirList(List<ViewUserDirInfo> dirList)
    {
        this.dirList = dirList;
    }

    public List<ViewUserResInfo> getResList()
    {
        return resList;
    }

    public void setResList(List<ViewUserResInfo> resList)
    {
        this.resList = resList;
    }

}
