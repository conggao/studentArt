package com.gk.entity.imgText.protocol;

public class ImgTextReq implements java.io.Serializable
{

    private Long    userId;
    private Integer count;
    private String  timeStart;
    private String  timeLastUpdate;

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Integer getCount()
    {
        return count;
    }

    public void setCount(Integer count)
    {
        this.count = count;
    }

    public String getTimeStart()
    {
        return timeStart;
    }

    public void setTimeStart(String timeStart)
    {
        this.timeStart = timeStart;
    }

    public String getTimeLastUpdate()
    {
        return timeLastUpdate;
    }

    public void setTimeLastUpdate(String timeLastUpdate)
    {
        this.timeLastUpdate = timeLastUpdate;
    }

}