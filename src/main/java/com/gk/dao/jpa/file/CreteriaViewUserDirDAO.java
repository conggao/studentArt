package com.gk.dao.jpa.file;

import com.gk.entity.file.ViewUserDirInfo;

import java.util.List;

public interface CreteriaViewUserDirDAO {
    List<ViewUserDirInfo> findByNameLikeAndParentIdAndCreateUserIdAndSchoolId(String name, Long parentId, Long createUserId, Integer schoolId);
}
