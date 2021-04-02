package com.neuedu.first.bean;

import lombok.Data;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *
 create table googs_t(
 id int PRIMARY key auto_increment comment '序号',
 gnumber char(11) comment '商品编号',
 name varchar(40) comment '商品名',
 price decimal(9,2) comment '销售单价',
 sellnumber int COMMENT '销售数量',
 stock  int COMMENT '库存',
 ifdelete BIGINT COMMENT '是否删除，0正常 1删除',
 classid  int  comment '分类id',
 described varchar(200) comment '整体描述',
 createtime timestamp COMMENT '创建时间',
 updatetime timestamp COMMENT '修改时间'
 )CHARSET=utf8;
 */
@Data
public class Googs {
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
