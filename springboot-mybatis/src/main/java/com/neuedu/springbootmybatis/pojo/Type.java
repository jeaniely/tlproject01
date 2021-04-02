package com.neuedu.springbootmybatis.pojo;

import lombok.Data;

@Data
public class Type {
    private Integer classid;
    private String name;
    private Integer parentid;
    private Integer leveld;
    private Integer ifleaf;
    private String described;
}
