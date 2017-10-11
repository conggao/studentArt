package com.gk.dao.jpa.file;

import com.gk.entity.file.UploadFileInfo;
import org.springframework.data.repository.CrudRepository;

public interface FileDAO extends CrudRepository<UploadFileInfo, Long> {


}
