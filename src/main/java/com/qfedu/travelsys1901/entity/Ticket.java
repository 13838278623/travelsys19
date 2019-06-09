package com.qfedu.travelsys1901.entity;

import lombok.Data;

@Data
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

    public Ticket(Integer tid, String ttype, String toutcity, String tincity, String tdate, String tcompany, String tsite, String tinfo, String tphone) {
        this.tid = tid;
        this.ttype = ttype;
        this.toutcity = toutcity;
        this.tincity = tincity;
        this.tdate = tdate;
        this.tcompany = tcompany;
        this.tsite = tsite;
        this.tinfo = tinfo;
        this.tphone = tphone;
    }
}