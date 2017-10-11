package com.gk.dao.jpa.file;

import com.gk.entity.file.ViewUserResInfo;

import java.util.List;

public interface CreteriaViewUserResDAO {
    List<ViewUserResInfo> findByFileNameLikeAndDirIdAndFileName(Long dirId, String fileName);

    ViewUserResInfo findByFileIdAndCreateUserId(Long fileId, Long userId);

    List<ViewUserResInfo> findByFileNameLikeAndDirIdAndCreateUserId(String condition, Long id, Long userId);
}
