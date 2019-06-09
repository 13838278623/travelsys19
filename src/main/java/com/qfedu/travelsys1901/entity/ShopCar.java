package com.qfedu.travelsys1901.entity;

import lombok.Data;

import java.util.Date;
@Data
public class ShopCar {
    private Integer scid;

    private Integer syoprice;

    private Integer schprice;

    private String sstan;

    private Integer smax;

    private Date sdate;

    private String svline;

    private String sphone;
}