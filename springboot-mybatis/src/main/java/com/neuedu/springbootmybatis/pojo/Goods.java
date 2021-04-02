package com.neuedu.springbootmybatis.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class Goods {
    private Integer id;
    private String gnumber;
    private String name;
    private BigDecimal price;
    private Integer sellnumber;
    private Integer stock;
    private Integer ifdelete;
    private Integer classid;
    private String described;
    private Timestamp createtime;
    private Timestamp updatetime;
}
