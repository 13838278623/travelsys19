package com.qfedu.travelsys1901.serice;

import com.qfedu.travelsys1901.entity.View;
import com.qfedu.travelsys1901.vo.JsonBean;

public interface ViewService {

    JsonBean selectByPrimaryKey(Integer vid);
}
