package com.gk.dao.jpa.file;

import com.gk.entity.file.ViewUserDirInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface ViewUserDirDAO extends CrudRepository<ViewUserDirInfo, Long>,JpaSpecificationExecutor<ViewUserDirInfo>,CreteriaViewUserDirDAO {
   /* @Query("select v from ViewUserDirInfo v where v.name like %?1 and v.parentId=?2 and v.createUserId = ?3 and v.schoolId = ?4")
    List<ViewUserDirInfo> findByNameLikeAndParentIdAndCreateUserIdAndSchoolId(String name, Long parentId, Long createUserId, Integer schoolId);*/
}
