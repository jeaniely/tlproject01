package com.neuedu.dao;


import org.springframework.stereotype.Component;

@Component
public class GoodsDAO {

    public  void add(){
        System.out.println("增加数据");
    }
    public  void delete(){
        System.out.println("删除数据");
    }
    public  void udpate(){
        System.out.println("修改数据");
    }
}
