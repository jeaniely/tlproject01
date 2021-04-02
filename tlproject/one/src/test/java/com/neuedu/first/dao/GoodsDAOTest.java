package com.neuedu.first.dao;

import com.neuedu.first.FirstDemo;
import com.neuedu.first.bean.Googs;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class GoodsDAOTest {
    private SqlSession sqlSession=null;
    @Before
    public void comment(){
        /*获取配置文件的输入流*/
        InputStream resourceAsStream = FirstDemo.class.getClassLoader().getResourceAsStream("mybatis-conf.xml");

        /*生产Sqlsession工厂类对象*/
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);

        /*SqlSession对象*/
         sqlSession=sqlSessionFactory.openSession();
    }

    @Test
    public void getAll() {

       /* System.out.println(sqlSession);*/

        List<Googs> getAll = sqlSession.selectList("getAll");
        System.out.println(getAll);

        sqlSession.close();

    }

    @Test
    public void getOne(){
        Googs g=sqlSession.selectOne("getOne",2);
        System.out.println(g);
        sqlSession.close();
    }
    @Test
    public void getByName(){
        List<Googs> getAll = sqlSession.selectList("getByName","%裙%");
        System.out.println(getAll);

        sqlSession.close();
    }

    @Test
    public void insert(){
        Googs googs=new Googs();
        googs.setGnumber("31112456");
        googs.setName("衬衣");
        googs.setClassid(3);
        googs.setPrice(new BigDecimal("108.8"));
        googs.setStock(50);
        googs.setDescribed("白色的衬衣");
        int i = sqlSession.insert("insert", googs);
        sqlSession.commit();
        System.out.println("影响行数："+i);
        sqlSession.close();
    }
}