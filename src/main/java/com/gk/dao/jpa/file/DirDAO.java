package com.gk.dao.jpa.file;

import com.gk.entity.file.DirInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DirDAO extends CrudRepository<DirInfo, Long> {
    // 带目录的资源管理
    // 目录管理

    // 获取共享网盘根目录
    DirInfo findBySchoolId(Integer schoolId);

    // 获取个人网盘根目录
    DirInfo findByCreateUserId(Long createUserId);


    List<DirInfo> findByNameLikeAndIdAndCreateUserIdAndSchoolIdAndParentIdNotNullAndDel(String name, Long id, Long createUserId, Integer schoolId, Boolean isDel);

    @Query("select d.id from DirInfo d where d.parentId=?1 and d.del=?2")
    List<Long> findByParentId(Long parentId,Boolean del);

    List<DirInfo> findByParentIdAndName(Long parentId, String name);
}
