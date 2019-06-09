package com.qfedu.travelsys1901.service.impl;

import com.qfedu.travelsys1901.dao.TicketMapper;
import com.qfedu.travelsys1901.dao.UserMapper;
import com.qfedu.travelsys1901.entity.Hotel;
import com.qfedu.travelsys1901.entity.Ticket;
import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.service.UserService;
import com.qfedu.travelsys1901.service.UserService;
import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.UseTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
   private  UserMapper userDao;
    @Autowired
    private TicketMapper ticketDao;
    @Override
    public User selectUser(int uid) {
        return userDao.selectByPrimaryKey(uid);
    }

    @Override
    public JsonBean addUseTicket(UseTicket useTicket) {
       Ticket tick = new Ticket();
       tick.setTtype(useTicket.getTtype());
       tick.setTcompany(useTicket.getTcompany());
       tick.setTdate(useTicket.getTdate());
       tick.setTincity(useTicket.getTincity());
       tick.setTinfo(useTicket.getTinfo());
       tick.setToutcity(useTicket.getToutcity());
       tick.setTphone(useTicket.getTphone());
       tick.setTsite(useTicket.getTsite());
       tick.setText(useTicket.getText());

        User user = new User();
        user.setUaddress(useTicket.getUaddress());
        user.setUemail( useTicket.getUemail());
        user.setUname(useTicket.getUname());
        user.setUphone(useTicket.getTphone());

        try {
         ticketDao.insert(tick);
            userDao.insertSelective(user);
            return new JsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();

            return new JsonBean(0,e.getMessage());
        }
    }

    @Override
    public void updateByPrimaryKeySelective(User  user) {
        userDao.updateByPrimaryKeySelective(user);
    }


    @Override
    public JsonBean selectByPh(String uphone ,String password) {


        User user1 = userDao.selectByPh(uphone);


        if(user1 == null) {
            throw new RuntimeException("该用户不存在");
        }
        if(!user1.getUpassword().equals(password)) {
            throw new RuntimeException("密码错误");
        }

        try {
            return new JsonBean(1,user1);
        } catch (Exception e) {
            e.printStackTrace();

            return new JsonBean(0,e.getMessage());
        }
    }

}
