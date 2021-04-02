package com.neuedu.springbootmybatis.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class GoodsDAOTest {

    @Autowired
    GoodsDAO goodsDAO;

    @Test
    public void selectALL() {
        System.out.println(goodsDAO.selectALL());
    }

    @Test
    public void selectOneByNumber() {

    }

    @Test
    public void delete() {

    }

    @Test
    public void update() {

    }
}