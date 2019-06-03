package com.qfedu.dao;

import com.qfedu.entity.Meal;

public interface MealMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Meal record);

    int insertSelective(Meal record);

    Meal selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Meal record);

    int updateByPrimaryKey(Meal record);
}