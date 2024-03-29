package com.qfedu.travelsys1901.dao;

import com.qfedu.travelsys1901.entity.Shop;

import java.util.List;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

    List<Shop>findAll();
}