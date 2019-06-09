package com.qfedu.travelsys1901.service.impl;

import com.qfedu.travelsys1901.dao.VOrderMapper;
import com.qfedu.travelsys1901.service.VOrderService;
import com.qfedu.travelsys1901.vo.VOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VOrderServiceImpl implements VOrderService {
    @Autowired
    private VOrderMapper vOderDao;
    @Override
    public List<VOrder> list() {


        List<VOrder> list = vOderDao.list();
        return list;
    }
}
