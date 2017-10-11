package com.gk.dao.jpa.file;

import com.gk.entity.file.ViewUserResInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface ViewUserResDAO extends CrudRepository<ViewUserResInfo, Long>, JpaSpecificationExecutor<ViewUserResInfo>, CreteriaViewUserResDAO {

    /*// 资源管理
    @Query("select v from ViewUserResInfo v where v.dirId = ?1 and v.fileName = ?2")
    List<ViewUserResInfo> findByFileNameLikeAndDirIdAndFileName(Long dirId, String fileName);

    @Query("select v from ViewUserResInfo v where v.fileId = ?1 and v.createUserId = ?2")
    ViewUserResInfo findByFileIdAndCreateUserId(Long fileId, Long userId);

    @Query("select v from ViewUserResInfo v where v.fileName = ?1 and v.dirId = ?2 and v.createUserId = ?3")
    List<ViewUserResInfo> findByFileNameLikeAndDirIdAndCreateUserId(String condition, Long id, Long userId);*/
}
