package com.neuedu.val;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class GoodsVal {
    private Integer id;
    private String gnumber;
    private String name;
    private BigDecimal price;
    private  Integer sellnumber;
    private Integer stock;
    private String status;
    private String tname;
    private String described;
    private Timestamp createtime;
    private Timestamp updatetime;
}
