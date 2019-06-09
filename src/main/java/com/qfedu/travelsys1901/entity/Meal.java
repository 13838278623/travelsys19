package com.qfedu.travelsys1901.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Meal {
    private Integer mid;

    private Date mdate;

    private String mstandard;

    private String myoprice;

    private String mchprice;

    private Integer mnum;

    private String moperate;

}