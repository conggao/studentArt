package com.gk.entity.file.protocol;

import java.util.List;

public class MyResDelReq
{
    private List<Long> listDirId;
    private List<Long> listResId;

    public List<Long> getListDirId()
    {
        return listDirId;
    }

    public void setListDirId(List<Long> listDirId)
    {
        this.listDirId = listDirId;
    }

    public List<Long> getListResId()
    {
        return listResId;
    }

    public void setListResId(List<Long> listResId)
    {
        this.listResId = listResId;
    }

}