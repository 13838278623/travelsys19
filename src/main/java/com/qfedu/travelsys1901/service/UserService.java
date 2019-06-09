package com.qfedu.travelsys1901.service;

import com.qfedu.travelsys1901.entity.Ticket;
import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.UseTicket;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    User selectUser(int uid);

    JsonBean addUseTicket (UseTicket useTicket);

    void updateByPrimaryKeySelective(User record);
    JsonBean selectByPh(String uphone ,String password);
}
