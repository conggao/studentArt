package com.gk.dao.jpa.file;

import com.gk.entity.file.UserResInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserResDAO extends CrudRepository<UserResInfo, Long> {
    // 资源管理
    List<UserResInfo> findByDirId(Long id);

    //List<Long> findByParentId(Long dirId);


}
