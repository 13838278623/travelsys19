package com.qfedu.service.impl;

import com.qfedu.dao.UserMapper;
import com.qfedu.entity.User;
import com.qfedu.serice.UserService;
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
