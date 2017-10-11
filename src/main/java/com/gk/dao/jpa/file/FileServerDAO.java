package com.gk.dao.jpa.file;

import com.gk.entity.file.FileServerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileServerDAO extends JpaRepository<FileServerInfo, Integer> {


}
