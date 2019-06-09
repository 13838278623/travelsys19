package com.qfedu.travelsys1901.controller;

import com.qfedu.travelsys1901.entity.Apply;
import com.qfedu.travelsys1901.service.ApplyService;
import com.qfedu.travelsys1901.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "网购操作",tags = "网购操作")
@Controller
@ResponseBody
public class ApplyConroller {
    @Autowired
    private ApplyService applyService;

    @CrossOrigin
    @ApiOperation(value = "网购",notes = "网购")
    @RequestMapping(value = "/apply/add.do",method = RequestMethod.PUT)
    public JsonBean add(Apply apply){
        return applyService.insertSelective(apply);
    }
}
