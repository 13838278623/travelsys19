package com.qfedu.travelsys1901.service.impl;

import com.qfedu.travelsys1901.dao.TicketMapper;
import com.qfedu.travelsys1901.dao.UserMapper;
import com.qfedu.travelsys1901.entity.Ticket;
import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.serice.UserService;
import com.qfedu.travelsys1901.vo.UseTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userDao;
@Autowired
private TicketMapper ticketDao;
    @Override
    public User selectUser(int uid) {
        return userDao.selectByPrimaryKey(uid);
    }

    @Override
    public void addUser(User user) {
        userDao.insert(user);
    }

    @Override
    public void addTicker(Ticket ticket) {
        String ttype = request.getParameter("ttype");
        String toutcity = request.getParameter("toutcity");
        String tincity = request.getParameter("tincity");
        String tdate = request.getParameter("tdate");
        String tphone = request.getParameter("tphone");
        String tcompany = request.getParameter("tcompany");
        String tsite = request.getParameter("tsite");
        String text = request.getParameter("text");
        String tinfo = request.getParameter("tinfo");
        Ticket ticket = new Ticket(0, ttype, toutcity, tincity, tdate, tcompany, tsite, tinfo, tphone);
        ticketDao.insert(ticket);
    }

    @Override
    public void updateByPrimaryKeySelective(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }
}
