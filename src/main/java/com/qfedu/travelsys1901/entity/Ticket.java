package com.qfedu.travelsys1901.entity;

public class Ticket {
    private Integer tid;

    private String ttype;

    private String toutcity;

    private String tincity;

    private String tdate;

    private String tcompany;

    private String tsite;

    private String tinfo;

    private String tphone;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype == null ? null : ttype.trim();
    }

    public String getToutcity() {
        return toutcity;
    }

    public void setToutcity(String toutcity) {
        this.toutcity = toutcity == null ? null : toutcity.trim();
    }

    public String getTincity() {
        return tincity;
    }

    public void setTincity(String tincity) {
        this.tincity = tincity == null ? null : tincity.trim();
    }

    public String getTdate() {
        return tdate;
    }

    public void setTdate(String tdate) {
        this.tdate = tdate == null ? null : tdate.trim();
    }

    public String getTcompany() {
        return tcompany;
    }

    public void setTcompany(String tcompany) {
        this.tcompany = tcompany == null ? null : tcompany.trim();
    }

    public String getTsite() {
        return tsite;
    }

    public void setTsite(String tsite) {
        this.tsite = tsite == null ? null : tsite.trim();
    }

    public String getTinfo() {
        return tinfo;
    }

    public void setTinfo(String tinfo) {
        this.tinfo = tinfo == null ? null : tinfo.trim();
    }

    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone == null ? null : tphone.trim();
    }
}