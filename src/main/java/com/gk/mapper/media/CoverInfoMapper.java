package com.gk.mapper.media;

import com.gk.model.media.CoverInfo;
import com.gk.model.media.CoverInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface CoverInfoMapper {
    int countByExample(CoverInfoExample example);

    int deleteByExample(CoverInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CoverInfo record);

    int insertSelective(CoverInfo record);

    List<CoverInfo> selectByExampleWithRowbounds(CoverInfoExample example, RowBounds rowBounds);

    List<CoverInfo> selectByExample(CoverInfoExample example);

    CoverInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CoverInfo record, @Param("example") CoverInfoExample example);

    int updateByExample(@Param("record") CoverInfo record, @Param("example") CoverInfoExample example);

    int updateByPrimaryKeySelective(CoverInfo record);

    int updateByPrimaryKey(CoverInfo record);
}