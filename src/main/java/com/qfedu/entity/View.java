package com.qfedu.entity;

public class View {
    private Integer vid;

    private Integer vprice;

    private String vphoto;

    private String vline;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getVprice() {
        return vprice;
    }

    public void setVprice(Integer vprice) {
        this.vprice = vprice;
    }

    public String getVphoto() {
        return vphoto;
    }

    public void setVphoto(String vphoto) {
        this.vphoto = vphoto == null ? null : vphoto.trim();
    }

    public String getVline() {
        return vline;
    }

    public void setVline(String vline) {
        this.vline = vline == null ? null : vline.trim();
    }
}