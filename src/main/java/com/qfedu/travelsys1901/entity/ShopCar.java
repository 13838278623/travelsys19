package com.qfedu.travelsys1901.entity;

import java.util.Date;

public class ShopCar {
    private Integer scid;

    private Integer syoprice;

    private Integer schprice;

    private String sstan;

    private Integer smax;

    private Date sdate;

    private String svline;

    private String sphone;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getSyoprice() {
        return syoprice;
    }

    public void setSyoprice(Integer syoprice) {
        this.syoprice = syoprice;
    }

    public Integer getSchprice() {
        return schprice;
    }

    public void setSchprice(int schprice) {
        this.schprice = schprice;
    }

    public String getSstan() {
        return sstan;
    }

    public void setSstan(String sstan) {
        this.sstan = sstan == null ? null : sstan.trim();
    }

    public Integer getSmax() {
        return smax;
    }

    public void setSmax(Integer smax) {
        this.smax = smax;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public String getSvline() {
        return svline;
    }

    public void setSvline(String svline) {
        this.svline = svline == null ? null : svline.trim();
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
    }
}