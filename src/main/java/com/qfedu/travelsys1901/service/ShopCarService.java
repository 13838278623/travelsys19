package com.qfedu.travelsys1901.service;

import com.qfedu.travelsys1901.entity.ShopCar;
import com.qfedu.travelsys1901.vo.JsonBean;

import javax.servlet.http.HttpSession;

public interface ShopCarService {

    void insertSelective(ShopCar record);
}
