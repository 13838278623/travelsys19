package com.qfedu.travelsys1901.serice;

import com.qfedu.travelsys1901.entity.Shop;
import com.qfedu.travelsys1901.entity.User;

public interface ShopService {
    //添加酒店信息
    void insertSelective(Shop record);
    //添加用户
    void insertSelective(User record);
}
