package com.qfedu.travelsys1901.entity;

import java.util.Date;

public class Apply {
    private Integer aid;

    private Integer ayonum;

    private Integer achnum;

    private Integer asum;

    private String agounum;

    private String apassword;

    private String aname;

    private String asex;

    private Date adate;

    private String acid;

    private String acidtype;

    private String asite;

    private String amessage;

    private String asexn;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
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

    public String getAgounum() {
        return agounum;
    }

    public void setAgounum(String agounum) {
        this.agounum = agounum == null ? null : agounum.trim();
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword == null ? null : apassword.trim();
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getAsex() {
        return asex;
    }

    public void setAsex(String asex) {
        this.asex = asex == null ? null : asex.trim();
    }

    public Date getAdate() {
        return adate;
    }

    public void setAdate(Date adate) {
        this.adate = adate;
    }

    public String getAcid() {
        return acid;
    }

    public void setAcid(String acid) {
        this.acid = acid == null ? null : acid.trim();
    }

    public String getAcidtype() {
        return acidtype;
    }

    public void setAcidtype(String acidtype) {
        this.acidtype = acidtype == null ? null : acidtype.trim();
    }

    public String getAsite() {
        return asite;
    }

    public void setAsite(String asite) {
        this.asite = asite == null ? null : asite.trim();
    }

    public String getAmessage() {
        return amessage;
    }

    public void setAmessage(String amessage) {
        this.amessage = amessage == null ? null : amessage.trim();
    }

    public String getAsexn() {
        return asexn;
    }

    public void setAsexn(String asexn) {
        this.asexn = asexn == null ? null : asexn.trim();
    }
}