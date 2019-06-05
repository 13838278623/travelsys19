package com.qfedu.travelsys1901.dao;

import com.qfedu.travelsys1901.entity.Meal;

public interface MealMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Meal record);

    int insertSelective(Meal record);

    Meal selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Meal record);

    int updateByPrimaryKey(Meal record);
}