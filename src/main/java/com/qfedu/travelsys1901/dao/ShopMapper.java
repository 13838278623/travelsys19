package com.qfedu.travelsys1901.dao;

import java.util.List;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

    //查询订单
    List<Shop> findAll();
}