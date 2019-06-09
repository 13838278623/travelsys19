package com.qfedu.travelsys1901.service.impl;

import com.qfedu.travelsys1901.dao.ShopCarMapper;
import com.qfedu.travelsys1901.entity.Shop;
import com.qfedu.travelsys1901.entity.ShopCar;
import com.qfedu.travelsys1901.service.ShopCarService;
import com.qfedu.travelsys1901.service.ShopService;
import com.qfedu.travelsys1901.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
@Service
public class ShopCarServiceImpl implements ShopCarService {

    @Autowired
    private ShopCarMapper shopDao;
    @Override
    public void insertSelective(ShopCar record) {
        shopDao.insertSelective(record);
    }
}
