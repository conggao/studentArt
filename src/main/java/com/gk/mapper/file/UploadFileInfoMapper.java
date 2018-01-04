package com.gk.mapper.file;

import com.gk.model.file.UploadFileInfo;
import com.gk.model.file.UploadFileInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UploadFileInfoMapper {
    int countByExample(UploadFileInfoExample example);

    int deleteByExample(UploadFileInfoExample example);

    int deleteByPrimaryKey(Long id);

    Long insert(UploadFileInfo record);

    int insertSelective(UploadFileInfo record);

    List<UploadFileInfo> selectByExample(UploadFileInfoExample example);

    UploadFileInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UploadFileInfo record, @Param("example") UploadFileInfoExample example);

    int updateByExample(@Param("record") UploadFileInfo record, @Param("example") UploadFileInfoExample example);

    int updateByPrimaryKeySelective(UploadFileInfo record);

    int updateByPrimaryKey(UploadFileInfo record);
}