package com.qfedu.travelsys1901.dao;

import com.qfedu.travelsys1901.entity.Permision;

public interface PermisionMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Permision record);

    int insertSelective(Permision record);

    Permision selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Permision record);

    int updateByPrimaryKey(Permision record);
}