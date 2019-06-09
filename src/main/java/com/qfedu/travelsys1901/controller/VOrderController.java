package com.qfedu.travelsys1901.controller;

import com.qfedu.travelsys1901.service.VOrderService;
import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.VOrder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.plugin2.message.JavaScriptBaseMessage;

import java.util.List;

@Api(value = "订单操作",tags = "订单操作")
@Controller
@ResponseBody
public class VOrderController {
    @Autowired
    private VOrderService vOrderService;
    @CrossOrigin
    @ApiOperation(value = "全部查询",notes = "全部查询")
    @RequestMapping(value = "/vorder/list.do",method = RequestMethod.GET)
    public JsonBean list(){
        try {
            List<VOrder> list = vOrderService.list();
            return new JsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0,e.getMessage());
        }


    }

}
