package com.qfedu.travelsys1901.service.impl;

import com.qfedu.travelsys1901.dao.ApplyMapper;
import com.qfedu.travelsys1901.entity.Apply;
import com.qfedu.travelsys1901.service.ApplyService;
import com.qfedu.travelsys1901.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    private ApplyMapper applyDao;
    @Override
    public JsonBean insertSelective(Apply apply) {

        try {
            applyDao.insertSelective(apply);
            return new JsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonBean(0,e.getMessage());
        }

    }
}
