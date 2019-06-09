package com.qfedu.travelsys1901.serice;

import com.qfedu.travelsys1901.entity.Ticket;
import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.vo.UseTicket;

public interface UserService {

    User selectUser(int uid);

    void addUser (User user, httpServletRequest );

    void addTicker(Ticket ticket);

    void updateByPrimaryKeySelective(User record);
}
