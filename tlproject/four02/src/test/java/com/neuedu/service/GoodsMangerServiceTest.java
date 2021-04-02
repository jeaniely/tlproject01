package com.neuedu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring-config.xml")
public class GoodsMangerServiceTest {

    @Autowired
    @Qualifier("goodsManagerServiceImp")
    public GoodsMangerService mangerService;

    @Test
    public void getAll(){
        System.out.println(mangerService.getAll());
    }


    @Test
    public void trancationTest(){
    mangerService.trancationTest();
    }
}