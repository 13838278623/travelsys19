package com.qfedu.travelsys1901.vo;

import io.swagger.models.auth.In;

import java.util.Date;

public class VOrder {

    private String vline;
    private String vphone;
    private Date sdate;
    private Integer ayonum;
    private Integer achnum;
    private Integer asum;
    private String aphone;

    public String getVline() {
        return vline;
    }

    public void setVline(String vline) {
        this.vline = vline;
    }

    public String getVphone() {
        return vphone;
    }

    public void setVphone(String vphone) {
        this.vphone = vphone;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public Integer getAyonum() {
        return ayonum;
    }

    public void setAyonum(Integer ayonum) {
        this.ayonum = ayonum;
    }

    public Integer getAchnum() {
        return achnum;
    }

    public void setAchnum(Integer achnum) {
        this.achnum = achnum;
    }

    public Integer getAsum() {
        return asum;
    }

    public void setAsum(Integer asum) {
        this.asum = asum;
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone;
    }
}
