package com.qfedu.travelsys1901.controller;

import com.qfedu.travelsys1901.entity.Ticket;
import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.serice.UserService;
import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.UseTicket;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import javax.servlet.http.HttpServletRequest;

@Api(value = "用户操作",tags = "用户操作")
@ResponseBody
@Controller
public class UserLoginController {

    @Autowired
    private UserService userService;
    @CrossOrigin
    @ApiOperation(value = "用户查询",notes = "查询一个用户")
    @RequestMapping(value = "/user/find.do",method = RequestMethod.GET)
    public JsonBean find( int uid){
        try {
            User user = userService.selectUser(uid);
            return new JsonBean(1,user);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0,e.getMessage());
        }
    }

    @CrossOrigin
    @ApiOperation(value = "修改用户",notes = "修改一个用户")
    @RequestMapping(value = "user/update.do", method = RequestMethod.PUT)
    public JsonBean update(User user){

        try {
            userService.updateByPrimaryKeySelective(user);

            return new JsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0,e.getMessage());
        }

    }



    @CrossOrigin
    @ApiOperation(value = "添加机票",notes = "添加订单")
    @RequestMapping(value = "/user/add.do", method = RequestMethod.POST)
    public JsonBean add(UseTicket useTicket, HttpServletRequest request){
        try {
           //userService.addUseTicket(useTicket,request);
            return new JsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            return  new JsonBean(0,e.getMessage());
        }

    }


}













