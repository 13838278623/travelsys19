package com.qfedu.travelsys1901.vo;

import com.qfedu.travelsys1901.entity.Ticket;
import lombok.Data;
@Data
public class UseTicket {
    private String uname;
    private String upassword;
    private String uemail;
    private String uaddress;
    private String ucode;

    private Integer tid;
    private String text;
    private String ttype;

    private String toutcity;

    private String tincity;

    private String tdate;

    private String tcompany;

    private String tsite;

    private String tinfo;

    private String tphone;

}
