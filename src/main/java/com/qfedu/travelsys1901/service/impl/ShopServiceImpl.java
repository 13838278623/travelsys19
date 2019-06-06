package com.qfedu.travelsys1901.service.impl;

import com.qfedu.travelsys1901.dao.ShopMapper;
import com.qfedu.travelsys1901.serice.ShopService;
import com.qfedu.travelsys1901.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopdao;

    @Override
    public JsonBean insertSelective(Shop shop) {



        try {
            shopdao.insertSelective(shop);
            return  new JsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0,e.getMessage());
        }

    }

    @Override
    public JsonBean findAll() {

        try {
            List<Shop> list = shopdao.findAll();

            return  new JsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0,e.getMessage());
        }

    }
}
