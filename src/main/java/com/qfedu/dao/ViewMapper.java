package com.qfedu.dao;

import com.qfedu.entity.View;

public interface ViewMapper {
    int deleteByPrimaryKey(Integer vid);

    int insert(View record);

    int insertSelective(View record);

    View selectByPrimaryKey(Integer vid);

    int updateByPrimaryKeySelective(View record);

    int updateByPrimaryKey(View record);
}