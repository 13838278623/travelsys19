package com.qfedu.travelsys1901.service;

import com.qfedu.travelsys1901.entity.Apply;
import com.qfedu.travelsys1901.vo.JsonBean;

public interface ApplyService  {

    JsonBean insertSelective(Apply record);
}
