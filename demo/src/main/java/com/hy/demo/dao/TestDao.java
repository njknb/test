package com.hy.demo.dao;

import com.hy.demo.common.PathVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 何志权27629
 * @description:
 * @date: 2021-03-16 20:05
 */

@Mapper
public interface TestDao {

    long advancedSearchCount(@Param("pathVo")PathVo pathVo) throws Exception;

    List<PathVo> advancedSearchList(@Param("pathVo")PathVo pathVo, @Param("page")long page, @Param("size")long size)throws Exception;
}
