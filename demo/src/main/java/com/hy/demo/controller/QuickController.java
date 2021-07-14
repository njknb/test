package com.hy.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "模板服务")
public class QuickController {

    @ApiOperation(value = "查询路径信息-分页12212121", notes = "查询路径信息-分页")
    @CrossOrigin
    @RequestMapping(value="/mapping11/path/advancedSearchList",method = RequestMethod.POST)
    public String quick(){
        return "我是SpringBoot1111";
    }
}
