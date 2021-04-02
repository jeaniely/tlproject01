package com.neuedu.springboot01.bean;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Integer age;
    private Date birth;

}
