package com.gk.service.impl;

import com.gk.entity.media.protocol.LoadAudioRsp;
import com.gk.entity.media.protocol.LoadMovieInfoRsp;
import com.gk.entity.media.protocol.LoadMovieReq;
import com.gk.entity.media.protocol.LoadMovieRsp;
import com.gk.mapper.file.UploadFileInfoMapper;
import com.gk.mapper.media.AudioInfoMapper;
import com.gk.mapper.media.CoverInfoMapper;
import com.gk.mapper.media.MovieInfoMapper;
import com.gk.model.media.CoverInfo;
import com.gk.model.media.CoverInfoExample;
import com.gk.model.media.MovieInfo;
import com.gk.model.media.MovieInfoExample;
import com.gk.service.LoadService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Service
public class LoadServiceImpl implements LoadService {
    @Autowired
    MovieInfoMapper movieInfoMapper;
    @Autowired
    AudioInfoMapper audioInfoMapper;
    @Autowired
    CoverInfoMapper coverInfoMapper;
    @Autowired
    UploadFileInfoMapper uploadFileInfoMapper;

    @Override
    public LoadMovieRsp findMovieList(LoadMovieReq req) {
        LoadMovieRsp rsp = new LoadMovieRsp();
        MovieInfoExample movieInfoExample = new MovieInfoExample();
        int offset = req.getPageNum() * (req.getPageNum() - 1);
        RowBounds rowBounds = new RowBounds(offset, req.getPageSize());
        movieInfoExample.createCriteria().andIsDelEqualTo(false);
        List<MovieInfo> movieInfoList = movieInfoMapper.selectByExampleWithRowbounds(movieInfoExample, rowBounds);
        Map<Long, List<MovieInfo>> movieInfoMap = movieInfoList.stream().collect(groupingBy(MovieInfo::getId));
        // 获取视频id
        List<Long> movieIdList = movieInfoList.stream().map(MovieInfo::getId).collect(toList());
        // 获取封面数据
        CoverInfoExample coverInfoExample = new CoverInfoExample();
        coverInfoExample.createCriteria().andMovieIdIn(movieIdList).andIsDelEqualTo(false);
        List<CoverInfo> coverInfoList = coverInfoMapper.selectByExample(coverInfoExample);
        Map<Long, List<CoverInfo>> coverMap = coverInfoList.stream().collect(groupingBy(CoverInfo::getMovieId));
        List<LoadMovieRsp.Movie> movieList = new ArrayList<>();
        for (Map.Entry<Long, List<CoverInfo>> entry : coverMap.entrySet()) {
            LoadMovieRsp.Movie movie = new LoadMovieRsp.Movie();
            movie.setMovieId(entry.getKey());
            movie.setTitle(movieInfoMap.get(entry.getKey()).get(0).getTitle());
            List<LoadMovieRsp.Cover> coverList = new ArrayList<>();
            for (CoverInfo coverInfo : entry.getValue()) {
                LoadMovieRsp.Cover cover = new LoadMovieRsp.Cover();
                Long fileId = coverInfo.getFileId();
                String url = uploadFileInfoMapper.selectByPrimaryKey(fileId).getPath();
                cover.setCoverFileId(fileId);
                cover.setUrl(url);
                cover.setCoverId(coverInfo.getId());
                coverList.add(cover);
            }
            movie.setCoverList(coverList);
            movieList.add(movie);

        }
        rsp.setCode(200);
        rsp.setMovieList(movieList);
        return rsp;
    }

    @Override
    public String findFileUrl(Long fileId) {
        return uploadFileInfoMapper.selectByPrimaryKey(fileId).getPath();
    }

    @Override
    public LoadAudioRsp findAudioList() {
        return null;
    }

    @Override
    public LoadMovieInfoRsp findMovieInfo(Long movieId) {
        String result = "查询成功";
        MovieInfo movieInfo = movieInfoMapper.selectByPrimaryKey(movieId);
        return new LoadMovieInfoRsp(movieInfo.getFileId(),
                "1.mp4", movieInfo.getTitle(), movieInfo.getIntroduction(), result, 200);
    }
}
