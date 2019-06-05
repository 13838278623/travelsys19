package com.qfedu.travelsys1901.serice;

import com.qfedu.travelsys1901.entity.Hotel;
import com.qfedu.travelsys1901.entity.Shop;
import com.qfedu.travelsys1901.entity.User;
import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.VHotel;
import springfox.documentation.spring.web.json.Json;

public interface HotelService {
    //添加酒店信息
    JsonBean insertSelective(VHotel vHotel);

}
