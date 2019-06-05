package com.qfedu.travelsys1901.vo;

import com.qfedu.travelsys1901.entity.Ticket;
import lombok.Data;
@Data
public class UseTicket extends Ticket {
    private String uname;
    private String uemail;
    private String uaddress;
}
