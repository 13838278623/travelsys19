package com.qfedu.travelsys1901.dao;

import com.qfedu.travelsys1901.entity.Apply;

public interface ApplyMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}