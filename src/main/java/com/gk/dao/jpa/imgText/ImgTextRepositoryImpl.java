package com.gk.dao.jpa.imgText;


import com.gk.entity.imgText.ViewImgTextBaseInfo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by pc on 2017/2/23.
 */
public class ImgTextRepositoryImpl implements ImgTextViewRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ViewImgTextBaseInfo> findListImgTextBaseInfo() {
        Query query = entityManager.createNativeQuery("SELECT * from cep_img_text.view_img_text_base_info WHERE isDel = 0", ViewImgTextBaseInfo.class);
        return query.getResultList();
    }

    @Override
    public List<ViewImgTextBaseInfo> LoadMore(Long classId, String timeStart, Integer count) {
        Query query = entityManager.createNativeQuery("SELECT * FROM cep_img_text.view_img_text_base_info WHERE classId = :classId AND createTime<:createTime AND isDel=0 ");
        query.setParameter("classId", classId);
        query.setParameter("createTime", timeStart);
        query.setFirstResult(1);
        query.setMaxResults(count);
        return query.getResultList();
    }

    @Override
    public List<ViewImgTextBaseInfo> update(Long classId, String timeStart, String timeLastUpdate) {
        Query query = entityManager.createNativeQuery("SELECT * FROM cep_img_text.view_img_text_base_info WHERE classId = :classId  and((createTime > :createTime and isDel = 0) or(createTime >= :createTeme and createTime <= :createTime and lastUpdateTime > :updateTime)) ");
        return query.getResultList();
    }
}
