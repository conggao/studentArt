package com.gk.service.impl;

import com.gk.entity.media.protocol.PublishMediaReq;
import com.gk.entity.media.protocol.PublishMovieRsp;
import com.gk.mapper.file.UploadFileInfoMapper;
import com.gk.mapper.media.CoverInfoMapper;
import com.gk.mapper.media.MovieInfoMapper;
import com.gk.model.file.UploadFileInfo;
import com.gk.model.media.CoverInfo;
import com.gk.model.media.MovieInfo;
import com.gk.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service

public class UploadFileServiceImpl implements UploadFileService {
    @Autowired
    UploadFileInfoMapper uploadFileInfoMapper;
    @Autowired
    MovieInfoMapper movieInfoMapper;
    @Autowired
    CoverInfoMapper coverInfoMapper;

    @Override
    public UploadFileInfo uploadFile(UploadFileInfo info) {
        Long insert = uploadFileInfoMapper.insert(info);
        if (insert != 0)
            return info;
        else
            return null;
    }

    @Override
    public PublishMovieRsp publishMovie(PublishMediaReq req) {
        PublishMovieRsp rsp = new PublishMovieRsp();
        String result = "上传视频成功";
        String title = req.getTitle();
        String introduction = req.getIntroduction();
        Long coverId = req.getCoverId();
        Long movieId = req.getMovieId();
        //上传movie
        MovieInfo movieInfo = new MovieInfo(null, movieId, title, new Date(), new Date(), false, introduction);
        int movieInsertNum = movieInfoMapper.insert(movieInfo);
        CoverInfo coverInfo = new CoverInfo(null, movieInfo.getId(),null,coverId, new Date(),new Date(), false);
        int coverInsertNum = coverInfoMapper.insert(coverInfo);
        if (movieInsertNum != 0) {
            rsp.setMovieId(movieInfo.getId());
            rsp.setResult(result);
            return rsp;
        }
        result = "存入数据库失败";
        rsp.setResult(result);
        return rsp;
    }
}
