package com.neuedu;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisConfigTest {
    public static void main(String[] args) {
        /*生成输入流*/
        InputStream resource = MybatisConfigTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
       /*生成工厂*/
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(resource);

        /*生成Sqlsession*/
        SqlSession session=sessionFactory.openSession();
        System.out.println(session);
    }
}
