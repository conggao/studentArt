package com.gk.service;

import com.gk.entity.media.protocol.LoadAudioRsp;
import com.gk.entity.media.protocol.LoadMovieInfoRsp;
import com.gk.entity.media.protocol.LoadMovieReq;
import com.gk.entity.media.protocol.LoadMovieRsp;

public interface LoadService {
    LoadMovieRsp findMovieList(LoadMovieReq req);
    String findFileUrl(Long fileId);

    LoadAudioRsp findAudioList();

    LoadMovieInfoRsp findMovieInfo(Long movieId);
}
