package com.qfedu.travelsys1901.dao;

import com.qfedu.travelsys1901.entity.ShopCar;

public interface ShopCarMapper {
    int deleteByPrimaryKey(Integer scid);

    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    ShopCar selectByPrimaryKey(Integer scid);

    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);
}