package com.hy.demo.service.impl;

import com.hy.demo.common.PageResult;
import com.hy.demo.common.PathVo;
import com.hy.demo.dao.TestDao;
import com.hy.demo.service.TestServeice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class TestServiceImpl implements TestServeice {

    @Autowired
    private TestDao testDao;

    @Override
    public PageResult<List<PathVo>> advancedSearchList(PathVo pathVo, long page, long size) throws Exception{
        PageResult pageResult = new PageResult();

        long count = testDao.advancedSearchCount(pathVo);

        if (count == 0){
            return pageResult;
        }

        List<PathVo> pathVoList = testDao.advancedSearchList(pathVo, page - 1, size);
        if (CollectionUtils.isEmpty(pathVoList)){
            return pageResult;
        }

        pageResult.setRows(pathVoList);
        pageResult.setPage(page);
        pageResult.setTotalSize(count);
        pageResult.setSize(size);

        return pageResult;
    }

}