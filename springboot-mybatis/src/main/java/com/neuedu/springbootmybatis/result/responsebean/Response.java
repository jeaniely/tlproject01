package com.neuedu.springbootmybatis.result.responsebean;

import lombok.Data;

@Data
public class Response <T>{
    private Integer code;
    private T data;
    private String msg;
}
