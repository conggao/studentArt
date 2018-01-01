package com.gk.service.file.impl;

import com.gk.mapper.file.UploadFileInfoMapper;
import com.gk.model.file.UploadFileInfo;
import com.gk.service.file.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UploadFileServiceImpl implements UploadFileService {
    @Autowired
    UploadFileInfoMapper mapper;

    @Override
    public Boolean uploadFile(UploadFileInfo info) {
        int insert = mapper.insert(info);
        if (insert == 1)
            return true;
        else
            return false;
    }
}
