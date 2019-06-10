package com.qfedu.travelsys1901.entity;


import lombok.Data;

import java.sql.Date;
@Data
public class User {
    private Integer uid;

    private String uname;

    private String upassword;

    private String uphone;

    private String uemail;

    private String ucode;

    private String usex;

    private Date ubirth;

    private String uzip;

    private String uaddress;

}