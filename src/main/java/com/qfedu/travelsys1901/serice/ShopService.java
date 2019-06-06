package com.qfedu.travelsys1901.serice;

import com.qfedu.travelsys1901.vo.JsonBean;

public interface ShopService {

     JsonBean insertSelective(Shop record);

     //查询订单
     JsonBean  findAll();
}
