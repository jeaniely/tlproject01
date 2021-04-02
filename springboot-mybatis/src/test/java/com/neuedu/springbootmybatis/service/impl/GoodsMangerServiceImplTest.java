package com.neuedu.springbootmybatis.service.impl;

import com.neuedu.springbootmybatis.service.GoodsManagerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsMangerServiceImplTest {

    @Autowired
    GoodsManagerService service;

    @Test
    public void addChildType() {
        service.addChildType(6,"李宁男士运动装");
    }

    @Test
    public void findByClass() {
    }
}