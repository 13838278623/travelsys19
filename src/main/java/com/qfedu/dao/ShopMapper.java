package com.qfedu.dao;

import com.qfedu.entity.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}