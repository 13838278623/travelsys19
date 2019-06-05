package com.qfedu.travelsys1901.entity;

import java.util.Date;

public class Hotel {
    private Integer hid;

    private String hincity;

    private Date hindate;

    private Date houtdate;

    private String hsite;

    private String t_Hotelcol;

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

    public String getT_Hotelcol() {
        return t_Hotelcol;
    }

    public void setT_Hotelcol(String t_Hotelcol) {
        this.t_Hotelcol = t_Hotelcol;
    }

    public String getTinfo() {
        return tinfo;
    }

    public void setTinfo(String tinfo) {
        this.tinfo = tinfo == null ? null : tinfo.trim();
    }
}