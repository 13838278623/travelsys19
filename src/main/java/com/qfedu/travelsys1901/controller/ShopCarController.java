package com.qfedu.travelsys1901.controller;

import com.qfedu.travelsys1901.entity.Shop;
import com.qfedu.travelsys1901.entity.ShopCar;
import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.service.ShopCarService;
import com.qfedu.travelsys1901.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Api(value = "购物车操作",tags = "购物车操作")
@Controller
@ResponseBody
public class ShopCarController {
    @Autowired
    private ShopCarService shopCarService;
    @CrossOrigin
    @ApiOperation(value = "添加",notes = "添加")
    @RequestMapping(value = "/shopcar/add.do",method = RequestMethod.PUT)
    public JsonBean add( HttpSession session, HttpServletRequest request){
        ShopCar car = new ShopCar();
        String  uphone = (String)session.getAttribute("uphone");
        String syoprice = request.getParameter("syoprice");
        String schprice= request.getParameter("schprice");
        String sphoto =   request.getParameter("sphoto");
        String sstan =   request.getParameter("sstan");
        String smax =   request.getParameter("smax");
        String sdate =   request.getParameter("sdate");
        String svline =   request.getParameter("svline");
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");//yyyy-MM-ddHH:mm:ss
        Integer sch = Integer.parseInt(schprice);
        Integer syo = Integer.parseInt(syoprice);

        try {
            Date  date = f.parse(sdate);
            car.setSchprice(sch);
            car.setSdate(date);
            car.setSmax(Integer.parseInt(smax));
            car.setSstan(sstan);
           car.setSyoprice(syo);
            car.setSphone(uphone);

            shopCarService.insertSelective(car);
            return new JsonBean(1,null);
        } catch (ParseException e) {
            e.printStackTrace();
            e.printStackTrace();
            return new JsonBean(0,e.getMessage());
        }

    }
}
