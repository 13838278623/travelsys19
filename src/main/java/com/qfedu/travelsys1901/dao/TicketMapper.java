package com.qfedu.travelsys1901.dao;

import com.qfedu.travelsys1901.entity.Ticket;

public interface TicketMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Ticket record);

    int insertSelective(Ticket record);

    Ticket selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKey(Ticket record);
}