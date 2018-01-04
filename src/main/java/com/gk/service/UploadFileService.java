package com.gk.service;

import com.gk.entity.media.protocol.PublishMediaReq;
import com.gk.entity.media.protocol.PublishMovieRsp;
import com.gk.model.file.UploadFileInfo;

public interface UploadFileService {
    UploadFileInfo uploadFile(UploadFileInfo info);


    PublishMovieRsp publishMovie(PublishMediaReq req);
}
