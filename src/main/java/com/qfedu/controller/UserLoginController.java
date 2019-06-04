package com.qfedu.controller;

import com.qfedu.entity.User;
import com.qfedu.serice.UserService;
import com.qfedu.vo.JsonBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.jar.JarEntry;

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
}













