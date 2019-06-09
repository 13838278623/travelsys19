package com.qfedu.travelsys1901.service.impl;

import com.qfedu.travelsys1901.dao.HotelMapper;
import com.qfedu.travelsys1901.dao.UserMapper;
import com.qfedu.travelsys1901.entity.Hotel;
import com.qfedu.travelsys1901.entity.User;

import com.qfedu.travelsys1901.service.HotelService;
import com.qfedu.travelsys1901.vo.JsonBean;
import com.qfedu.travelsys1901.vo.VHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelMapper hotelDao;
    @Autowired
    private UserMapper  userDao;
    @Override
    public JsonBean  insertSelective(VHotel vHotel) {
        Hotel hotel = new Hotel();
        User user = new User();

        hotel.setTinfo(vHotel.getTinfo());
        hotel.setHid(vHotel.getHid());
        hotel.setHincity(vHotel.getHincity());
        hotel.setHindate(vHotel.getHindate());
        hotel.setHsite(vHotel.getHsite());

        hotel.setT_Hotelcol(vHotel.getT_hotelcol());

        hotel.setHoutdate(vHotel.getHoutdate());

        user.setUaddress(vHotel.getUaddress());
        user.setUemail( vHotel.getUemail());
        user.setUname(vHotel.getUname());
        user.setUphone(vHotel.getUphone());

        try {
            hotelDao.insertSelective(hotel);
            userDao.insertSelective(user);
            return new JsonBean(1,null);
        } catch (Exception e) {
            e.printStackTrace();

            return new JsonBean(0,e.getMessage());
        }

    }

}
