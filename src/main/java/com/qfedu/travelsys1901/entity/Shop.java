package com.qfedu.travelsys1901.entity;

import java.util.Date;

public class Shop {
    private Integer sid;

    private Integer syoprice;

    private Integer schprice;

    private String sphoto;

    private String sstan;

    private Integer smax;

    private Date sdate;

    private String svline;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public void setSchprice(Integer schprice) {
        this.schprice = schprice;
    }

    public String getSphoto() {
        return sphoto;
    }

    public void setSphoto(String sphoto) {
        this.sphoto = sphoto == null ? null : sphoto.trim();
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
}