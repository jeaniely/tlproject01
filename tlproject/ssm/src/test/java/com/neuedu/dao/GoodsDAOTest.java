package com.neuedu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class GoodsDAOTest {

    @Autowired
    private GoodsDAO goodsDAO;

    @Test
    public void selectALL() {
        System.out.println(goodsDAO.selectALL());
    }

    @Test
    public void selectOneByNumber() {
    }

    @Test
    public void selectByName() {
    }

    @Test
    public void update() {
    }
}