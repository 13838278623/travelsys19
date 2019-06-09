package com.qfedu.travelsys1901.service;

import com.qfedu.travelsys1901.entity.View;
import com.qfedu.travelsys1901.vo.JsonBean;

import java.util.List;

public interface ViewService {

    JsonBean selectByPrimaryKey(Integer vid);

    JsonBean findAll();
}
