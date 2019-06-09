package com.qfedu.travelsys1901.dao;

import com.qfedu.travelsys1901.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User record);
    User selectByPh(String uphone);

}