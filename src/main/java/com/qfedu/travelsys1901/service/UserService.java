package com.qfedu.travelsys1901.service;

import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.UseTicket;

public interface UserService {

    User selectUser(int uid);

    void add(UseTicket ticket);

    void updateByPrimaryKeySelective(User record);
    JsonBean selectByPh(String uphone ,String password);
}
