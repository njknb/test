package com.hy.demo.service;

import com.hy.demo.common.PageResult;
import com.hy.demo.common.PathVo;

import java.util.List;

/**
 * @author: 何志权27629
 * @description:
 * @date: 2021-03-16 20:02
 */
public interface TestServeice {
    PageResult<List<PathVo>> advancedSearchList(PathVo pathVo, long page, long size)throws Exception;
}
