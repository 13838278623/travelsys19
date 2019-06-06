package com.qfedu.travelsys1901.controller;

import com.qfedu.travelsys1901.serice.ViewService;
import com.qfedu.travelsys1901.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "景色路线操作",tags = "景色路线操作")
@ResponseBody
@Controller
public class ViewController {
    @Autowired
    private ViewService viewService;

    @CrossOrigin
    @ApiOperation(value = "查询路线",notes ="查询路线" )
    @RequestMapping(value = "/view/list.do",method = RequestMethod.GET)
    public JsonBean list(){

       return  viewService.findAll();


    }
}
