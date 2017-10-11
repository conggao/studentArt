package com.gk.entity.common.protocol;

import com.gk.entity.master.GradeInfo;
import com.gk.entity.master.ViewClassBaseInfo;

import java.util.List;

public class SchoolInfoRsp
{
    private List<GradeInfo>         listGradeInfo;
    private List<ViewClassBaseInfo> listViewClassBaseInfo;

    public List<ViewClassBaseInfo> getListViewClassBaseInfo()
    {
        return listViewClassBaseInfo;
    }

    public void setListViewClassBaseInfo(List<ViewClassBaseInfo> listViewClassBaseInfo)
    {
        this.listViewClassBaseInfo = listViewClassBaseInfo;
    }

    public List<GradeInfo> getListGradeInfo()
    {
        return listGradeInfo;
    }

    public void setListGradeInfo(List<GradeInfo> listGradeInfo)
    {
        this.listGradeInfo = listGradeInfo;
    }

}
