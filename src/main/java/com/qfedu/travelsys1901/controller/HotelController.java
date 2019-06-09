package com.qfedu.travelsys1901.controller;


import com.qfedu.travelsys1901.entity.Hotel;
import com.qfedu.travelsys1901.service.HotelService;
import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.VHotel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "酒店操作",tags = "酒店操作")
@ResponseBody
@Controller
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @CrossOrigin
    @ApiOperation(value = "酒店订单",notes = "订单一个用户")
    @RequestMapping(value = "/hote/add.do",method = RequestMethod.PUT)
    public JsonBean add(VHotel vHotel){


      return   hotelService.insertSelective(vHotel);

    }
}
