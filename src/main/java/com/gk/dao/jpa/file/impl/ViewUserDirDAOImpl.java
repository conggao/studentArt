package com.gk.dao.jpa.file.impl;

import com.gk.dao.jpa.file.CreteriaViewUserDirDAO;
import com.gk.dao.jpa.file.ViewUserDirDAO;
import com.gk.entity.file.ViewUserDirInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class ViewUserDirDAOImpl implements CreteriaViewUserDirDAO {
    @Autowired
    ViewUserDirDAO viewUserDirDAO;

    @Override
    public List<ViewUserDirInfo> findByNameLikeAndParentIdAndCreateUserIdAndSchoolId(String name, Long parentId, Long createUserId, Integer schoolId) {
        List<ViewUserDirInfo> result = null;
        Specification<ViewUserDirInfo> specification = (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (null != name) {
                predicates.add(cb.like(root.get("name"), "%" + name + "%"));
            }
            if (null != parentId) {
                predicates.add(cb.equal(root.get("parentId"), parentId));
            }
            if (null != createUserId) {
                predicates.add(cb.equal(root.get("createUserId"), createUserId));
            }
            if (null != schoolId) {
                predicates.add(cb.equal(root.get("schoolId"), schoolId));
            }
            return cb.and(predicates.toArray(new Predicate[predicates.size()]));
        };
        result = viewUserDirDAO.findAll(specification);
        return result;
    }
}
