package com.neuedu.first;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class FirstDemo {
    public static void main(String[] args) {
        /*获取配置文件的输入流*/
        InputStream resourceAsStream = FirstDemo.class.getClassLoader().getResourceAsStream("mybatis-conf.xml");

        /*生产Sqlsession工厂类对象*/
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);

        /*SqlSession对象*/
        SqlSession sqlSession=sqlSessionFactory.openSession();
        System.out.println(sqlSession);

    }
}
