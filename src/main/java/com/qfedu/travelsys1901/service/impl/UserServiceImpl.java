package com.qfedu.travelsys1901.service.impl;

import com.qfedu.travelsys1901.dao.UserMapper;
import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.serice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userDao;
    @Override
    public User selectUser(int uid) {
        return userDao.selectByPrimaryKey(uid);
    }
}
