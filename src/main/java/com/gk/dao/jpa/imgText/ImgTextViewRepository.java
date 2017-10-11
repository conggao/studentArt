package com.gk.dao.jpa.imgText;


import com.gk.entity.imgText.ViewImgTextBaseInfo;

import java.util.List;

public interface ImgTextViewRepository {
    List<ViewImgTextBaseInfo> findListImgTextBaseInfo();
    List<ViewImgTextBaseInfo> LoadMore(Long classId, String timeStart, Integer count);
    List<ViewImgTextBaseInfo> update(Long classId, String timeStart, String timeLastUpdate);



}
