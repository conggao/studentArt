package com.gk.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;
import com.gk.entity.media.protocol.LoadMovieRsp;
import com.gk.model.media.CoverInfo;
import com.gk.model.media.MovieInfo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class StreamUtilsTest {
    @Test
    public void streamTest() {
        List<Long> movieIdList = new ArrayList<>();
        movieIdList.add(11L);
        movieIdList.add(13L);
        List<CoverInfo> coverInfoList = new ArrayList<>();
        CoverInfo coverInfo1 = new CoverInfo(1L, 11L, null, null, null, null, null);
        CoverInfo coverInfo2 = new CoverInfo(2L, 11L, null, null, null, null, null);
        CoverInfo coverInfo3 = new CoverInfo(3L, 13L, null, null, null, null, null);
        coverInfoList.add(coverInfo1);
        coverInfoList.add(coverInfo2);
        coverInfoList.add(coverInfo3);
        Map<Long, List<CoverInfo>> coverMap = coverInfoList.stream().collect(groupingBy(CoverInfo::getMovieId));
        System.out.println(JSONObject.toJSONString(coverMap));
        System.out.println(JSON.toJSON(coverMap));


    }
}
