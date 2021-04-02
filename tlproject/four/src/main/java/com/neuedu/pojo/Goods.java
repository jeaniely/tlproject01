package com.neuedu.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component(value = "goods") //<bean id="goods" class="">
public class Goods {
    private Integer id;
    private String name;
    private String gnumber;

}
