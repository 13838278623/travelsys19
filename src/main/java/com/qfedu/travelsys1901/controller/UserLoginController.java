package com.qfedu.travelsys1901.controller;

import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.serice.UserService;
import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.UseTicket;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "用户操作",tags = "用户操作")
@ResponseBody
@Controller
public class UserLoginController {

    @Autowired
    private UserService userService;
    @CrossOrigin
    @ApiOperation(value = "用户查询",notes = "查询一个用户")
    @RequestMapping("/user/list.do")
    public JsonBean list(@RequestBody int uid){
        try {
            User user = userService.selectUser(uid);
            return new JsonBean(1,user);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0,e.getMessage());
        }
    }
    @CrossOrigin
    @ApiOperation(value = "添加机票",notes = "添加订单")
    @RequestMapping("/user/add.do")
    public JsonBean add(@RequestBody UseTicket ticket){
        try {
            userService.add(ticket);
            return new JsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            return  new JsonBean(0,e.getMessage());
        }

    }


}













