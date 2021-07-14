package com.hy.demo.controller;

import com.hy.demo.common.PageResult;
import com.hy.demo.common.PathVo;
import com.hy.demo.common.Result;
import com.hy.demo.common.SysGlobalConst;
import com.hy.demo.service.TestServeice;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "模板服务")
public class TestController {

    @Autowired
    private TestServeice testServeice;

    @ApiOperation(value = "查询路径信息-分页", notes = "查询路径信息-分页")
    @CrossOrigin
    @RequestMapping(value="/mapping/path/advancedSearchList",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam( paramType = "header", name = SysGlobalConst.HTTP_HEADER_EXMP_NO, value = "工号", required = true, defaultValue = "27629"),
            @ApiImplicitParam( paramType = "header", name = SysGlobalConst.HTTP_HEADER_LANG_ID, value = "语言", required = true, defaultValue = "zh")
    })
    public Result advancedSearchList(
            @RequestHeader(name = SysGlobalConst.HTTP_HEADER_EXMP_NO , required = true) String empNo,
            @RequestHeader(name = SysGlobalConst.HTTP_HEADER_LANG_ID , required = true) String langId,
            @RequestParam(required = true,value = "page") long page,
            @RequestParam(required = true, value = "size") long size,
            @RequestBody @ApiParam(value = "路径实体类", required = true) PathVo pathVo) throws Exception{
        Result result = new Result();
        PageResult<List<PathVo>> pageResult = testServeice.advancedSearchList(pathVo, page, size);
        result.successResult(pageResult);
        return result;
    }

    @ApiOperation(value = "根据id,查询路径信息", notes = "根据id,查询路径信息")
    @CrossOrigin
    @RequestMapping(value="/mapping/path/findById",method = RequestMethod.GET)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "路径id", required = true, defaultValue = "1", paramType = "query")
    })
    public Result findById(@RequestParam(required = true) String id) throws Exception{
        Result result = new Result();
        //PathVo pathVo = testServeice.findById(id);
        //result.successResult(pathVo);
        return result;
    }
}