package com.qfedu.travelsys1901.entity;

import java.util.Date;

public class Hotel {
    private Integer hid;

    private String hincity;

    private Date hindate;

    private Date houtdate;

    private String hsite;

    private String tHotelcol;

    private String tinfo;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHincity() {
        return hincity;
    }

    public void setHincity(String hincity) {
        this.hincity = hincity == null ? null : hincity.trim();
    }

    public Date getHindate() {
        return hindate;
    }

    public void setHindate(Date hindate) {
        this.hindate = hindate;
    }

    public Date getHoutdate() {
        return houtdate;
    }

    public void setHoutdate(Date houtdate) {
        this.houtdate = houtdate;
    }

    public String getHsite() {
        return hsite;
    }

    public void setHsite(String hsite) {
        this.hsite = hsite == null ? null : hsite.trim();
    }

    public String gettHotelcol() {
        return tHotelcol;
    }

    public void settHotelcol(String tHotelcol) {
        this.tHotelcol = tHotelcol == null ? null : tHotelcol.trim();
    }

    public String getTinfo() {
        return tinfo;
    }

    public void setTinfo(String tinfo) {
        this.tinfo = tinfo == null ? null : tinfo.trim();
    }
}