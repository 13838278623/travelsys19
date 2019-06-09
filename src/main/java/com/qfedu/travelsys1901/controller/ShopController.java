package com.qfedu.travelsys1901.controller;


import com.qfedu.travelsys1901.entity.Shop;
import com.qfedu.travelsys1901.service.ShopService;
import com.qfedu.travelsys1901.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(value = "套餐操作",tags = "套餐操作")
@Controller
@ResponseBody
public class ShopController {
    @Autowired
    private ShopService shopService;

    @CrossOrigin
    @ApiOperation(value = "查询套餐",notes = "查询订购套餐")
    @RequestMapping(value ="/shop/list.do",method = RequestMethod.GET)
    public JsonBean  list(){

        return   shopService.findAll();

    }

}
