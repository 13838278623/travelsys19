package com.qfedu.travelsys1901.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Shop {
    private Integer sid;

    private Integer syoprice;

    private Integer schprice;

    private String sphoto;

    private String sstan;

    private Integer smax;

    private Date sdate;

    private String svline;

}