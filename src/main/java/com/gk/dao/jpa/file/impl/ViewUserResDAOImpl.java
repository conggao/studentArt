package com.gk.dao.jpa.file.impl;

import com.gk.dao.jpa.file.CreteriaViewUserResDAO;
import com.gk.dao.jpa.file.ViewUserResDAO;
import com.gk.entity.file.ViewUserResInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class ViewUserResDAOImpl implements CreteriaViewUserResDAO {
    @Autowired
    ViewUserResDAO viewUserResDAO;

    @Override
    public List<ViewUserResInfo> findByFileNameLikeAndDirIdAndCreateUserId(String fileName, Long id, Long userId) {

        List<ViewUserResInfo> result = null;
        Specification<ViewUserResInfo> specification = (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (null != fileName) {
                predicates.add(cb.like(root.get("fileName"), "%" + fileName + "%"));
            }
            if (null != id) {
                predicates.add(cb.equal(root.get("id"), id));
            }
            if (null != userId) {
                predicates.add(cb.equal(root.get("createUserId"), userId));
            }
            return cb.and(predicates.toArray(new Predicate[predicates.size()]));
        };
        result = viewUserResDAO.findAll(specification);
        return result;
    }

    @Override
    public List<ViewUserResInfo> findByFileNameLikeAndDirIdAndFileName(Long dirId, String fileName) {
        return null;
    }

    @Override
    public ViewUserResInfo findByFileIdAndCreateUserId(Long fileId, Long userId) {
        return null;
    }

}

