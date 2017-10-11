package com.gk.dao.jpa.imgText;

import com.gk.entity.imgText.ImgTextFileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pc on 2017/2/23.
 */
public interface ImgTextFileRepository extends JpaRepository<ImgTextFileInfo,Long> {

}
