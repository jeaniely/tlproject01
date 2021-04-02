package com.neuedu.dao;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.MybatisConfigTest;
import com.neuedu.bean.Goods;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class GoodsDAOTest {
    private SqlSession session=null;
    @Before
    public void getSession() throws IOException {
        /*生成输入流*/
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        /*生成工厂*/
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(resource);

        /*生成Sqlsession*/
         session=sessionFactory.openSession();
    }
    @Test
    public void selectALL() {
        /*第一个参数：方法名*/
        List<Goods> goodslist = session.selectList("selectALL");
        System.out.println(goodslist);
        session.close();
    }

    @Test
    public void selectOneByNumber() {
        Goods goods = session.selectOne("selectOneByNumber", "200000004");
        System.out.println(goods);
        session.close();
    }

    @Test
    public void add() {
        Goods goods=new Goods();
        goods.setGnumber("12345678901");
        goods.setName("休闲裤");
        goods.setPrice(new BigDecimal("499.99"));
        goods.setStock(500);
        goods.setClassid(2);
        goods.setDescribed("黑色");
        int i = session.insert("add", goods);
        session.commit();
        System.out.println("影响的行数："+i);
        session.close();

    }

    @Test
    public void  selectByNamevoid(){
        /*"%裙%"*/
        List<Goods> goodslist = session.selectList("selectByName", "裙");
        System.out.println(goodslist);
        session.close();
    }

    /*@After
    public void close(){
        session.close();
    }*/

    @Test
    public void pagerTest(){
        // 提取第二页的3条记录
        PageHelper.startPage(2,3);
        //从数据库中提取所有的数据
        List<Goods> goodslist = session.selectList("selectALL");

        // 提取的记录和记录的信息，比如第几页，这页条数，总条数等
       /* System.out.println(goodslist);*/
        for(Goods g:goodslist){
            System.out.println(g);
        }

        //当前页的信息
        PageInfo<Goods> info=new PageInfo<Goods>(goodslist);
        System.out.println("总条数："+info.getTotal());

    }

}