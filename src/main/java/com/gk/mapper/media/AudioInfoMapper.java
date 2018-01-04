package com.gk.mapper.media;

import com.gk.model.media.AudioInfo;
import com.gk.model.media.AudioInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface AudioInfoMapper {
    int countByExample(AudioInfoExample example);

    int deleteByExample(AudioInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AudioInfo record);

    int insertSelective(AudioInfo record);

    List<AudioInfo> selectByExampleWithBLOBsWithRowbounds(AudioInfoExample example, RowBounds rowBounds);

    List<AudioInfo> selectByExampleWithBLOBs(AudioInfoExample example);

    List<AudioInfo> selectByExampleWithRowbounds(AudioInfoExample example, RowBounds rowBounds);

    List<AudioInfo> selectByExample(AudioInfoExample example);

    AudioInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AudioInfo record, @Param("example") AudioInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") AudioInfo record, @Param("example") AudioInfoExample example);

    int updateByExample(@Param("record") AudioInfo record, @Param("example") AudioInfoExample example);

    int updateByPrimaryKeySelective(AudioInfo record);

    int updateByPrimaryKeyWithBLOBs(AudioInfo record);

    int updateByPrimaryKey(AudioInfo record);
}