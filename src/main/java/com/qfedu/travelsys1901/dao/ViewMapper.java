package com.qfedu.travelsys1901.dao;

import com.qfedu.travelsys1901.entity.View;

import java.util.List;

public interface ViewMapper {
    int deleteByPrimaryKey(Integer vid);

    int insert(View record);

    int insertSelective(View record);

    View selectByPrimaryKey(Integer vid);

    int updateByPrimaryKeySelective(View record);

    int updateByPrimaryKey(View record);

    List<View> findAll();
}