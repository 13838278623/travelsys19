package com.qfedu.travelsys1901.service;

import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.VHotel;

public interface HotelService {
    //添加酒店信息
    JsonBean insertSelective(VHotel vHotel);

}
