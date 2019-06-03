package com.qfedu.entity;

public class Shop {
    private Integer sid;

    private Integer syonum;

    private Integer schnum;

    private String sjuannum;

    private String spassword;

    private String sphone;

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
}