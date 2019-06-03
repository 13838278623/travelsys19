package com.qfedu.entity;

import java.util.Date;

public class Meal {
    private Integer mid;

    private Date mdate;

    private String mstandard;

    private String myoprice;

    private String mchprice;

    private Integer mnum;

    private String moperate;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public String getMstandard() {
        return mstandard;
    }

    public void setMstandard(String mstandard) {
        this.mstandard = mstandard == null ? null : mstandard.trim();
    }

    public String getMyoprice() {
        return myoprice;
    }

    public void setMyoprice(String myoprice) {
        this.myoprice = myoprice == null ? null : myoprice.trim();
    }

    public String getMchprice() {
        return mchprice;
    }

    public void setMchprice(String mchprice) {
        this.mchprice = mchprice == null ? null : mchprice.trim();
    }

    public Integer getMnum() {
        return mnum;
    }

    public void setMnum(Integer mnum) {
        this.mnum = mnum;
    }

    public String getMoperate() {
        return moperate;
    }

    public void setMoperate(String moperate) {
        this.moperate = moperate == null ? null : moperate.trim();
    }
}