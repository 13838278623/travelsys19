package com.qfedu.travelsys1901.dao;

import com.qfedu.travelsys1901.entity.Hotel;

public interface HotelMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    Hotel selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKey(Hotel record);
}