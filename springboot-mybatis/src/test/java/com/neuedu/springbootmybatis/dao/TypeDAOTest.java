package com.neuedu.springbootmybatis.dao;

import com.neuedu.springbootmybatis.pojo.Type;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeDAOTest {

    @Autowired
    TypeDAO typeDAO;

    @Test
    public void selectAll() {
        System.out.println(typeDAO.selectAll());
    }

    @Test
    public void selectByParentId() {
        System.out.println(typeDAO.selectByParentId(1));
    }

    @Test
    public void selectByClassid() {
        System.out.println(typeDAO.selectByClassid(1));
    }

    @Test
    public void selectByName() {
        System.out.println(typeDAO.selectByName("衣服"));
    }

    @Test
    public void add() {
        Type type=new Type();
        type.setName("裙子");
        type.setParentid(3);
        type.setIfleaf(0);
        type.setLeveld(3);
        System.out.println("影响的行数"+typeDAO.add(type));
    }

    @Test
    public void updateName() {
    }

    @Test
    public void updateIfLeaf() {
    }

    @Test
    public void deleteByClassid() {
    }

    @Test
    public void deleteByClParentid() {
    }
}