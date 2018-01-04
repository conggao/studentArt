package com.gk.mapper.media;

import com.gk.model.media.MovieInfo;
import com.gk.model.media.MovieInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface MovieInfoMapper {
    int countByExample(MovieInfoExample example);

    int deleteByExample(MovieInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MovieInfo record);

    int insertSelective(MovieInfo record);

    List<MovieInfo> selectByExampleWithBLOBsWithRowbounds(MovieInfoExample example, RowBounds rowBounds);

    List<MovieInfo> selectByExampleWithBLOBs(MovieInfoExample example);

    List<MovieInfo> selectByExampleWithRowbounds(MovieInfoExample example, RowBounds rowBounds);

    List<MovieInfo> selectByExample(MovieInfoExample example);

    MovieInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MovieInfo record, @Param("example") MovieInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") MovieInfo record, @Param("example") MovieInfoExample example);

    int updateByExample(@Param("record") MovieInfo record, @Param("example") MovieInfoExample example);

    int updateByPrimaryKeySelective(MovieInfo record);

    int updateByPrimaryKeyWithBLOBs(MovieInfo record);

    int updateByPrimaryKey(MovieInfo record);
}