package com.qfedu.travelsys1901.entity;

public class Shop {
    private Integer sid;

    private Integer syonum;

    private Integer schnum;

    private String sjuannum;

    private String spassword;

    private String sphone;

    private String sphoto;

    private String sstan;

    private String smax;

    private String sdate;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getSyonum() {
        return syonum;
    }

    public void setSyonum(Integer syonum) {
        this.syonum = syonum;
    }

    public Integer getSchnum() {
        return schnum;
    }

    public void setSchnum(Integer schnum) {
        this.schnum = schnum;
    }

    public String getSjuannum() {
        return sjuannum;
    }

    public void setSjuannum(String sjuannum) {
        this.sjuannum = sjuannum == null ? null : sjuannum.trim();
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword == null ? null : spassword.trim();
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
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

    public String getSmax() {
        return smax;
    }

    public void setSmax(String smax) {
        this.smax = smax == null ? null : smax.trim();
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate == null ? null : sdate.trim();
    }
}