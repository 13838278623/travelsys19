package com.qfedu.travelsys1901.service.impl;

import com.qfedu.travelsys1901.dao.ViewMapper;
import com.qfedu.travelsys1901.entity.View;
import com.qfedu.travelsys1901.service.ViewService;
import com.qfedu.travelsys1901.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ViewServiceImpl implements ViewService {

    @Autowired
    private ViewMapper viewDao;
    @Override
    public JsonBean selectByPrimaryKey(Integer vid) {


        try {
            View view = viewDao.selectByPrimaryKey(vid);
            return new JsonBean(1,view);
        } catch (Exception e) {
            e.printStackTrace();

            return new JsonBean(0,e.getMessage());
        }

    }

    @Override
    public JsonBean findAll() {
        List<View> list = viewDao.findAll();


        try {
            return  new JsonBean(1,list);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0,e.getMessage());
        }

    }


}
