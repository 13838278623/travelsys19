package com.qfedu.travelsys1901.service;

import com.qfedu.travelsys1901.entity.Shop;
import com.qfedu.travelsys1901.vo.JsonBean;

public interface ShopService {

     JsonBean insertSelective(Shop record);

     //查询订单
     JsonBean  findAll();
}
