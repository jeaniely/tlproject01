package com.neuedu.springbootmybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/*
@Configuration
@MapperScan(basePackages = "com.neuedu.springbootmybatis.dao",sqlSessionFactoryRef = "sqlSessionFactory")
*/
public class DataSourceConfig {

//    @Autowired
//   DataSourceParams params;
//
//    @Bean(name="dataSource")
//    public DataSource dataSource(){
//        DruidDataSource dataSource=new DruidDataSource();
//        dataSource.setDriverClassName(params.getDriverClassName());
//        dataSource.setUrl(params.getUrl());
//        dataSource.setUsername(params.getUsername());
//        dataSource.setPassword(params.getPassword());
//
//        dataSource.setInitialSize(params.getInitialSize());
//        dataSource.setMinIdle(params.getMinIdle());
//         dataSource.setMaxActive(params.getMaxActive());
//         dataSource.setMaxWait(params.getMaxWait());
//        return dataSource;
//    }
//
//    @Bean(name="sqlSessionFactory")
//    public SqlSessionFactory getSqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource);
//        factoryBean.setTypeAliasesPackage("com.neuedu.springbootmybatis.pojo");
//        return factoryBean.getObject();
//    }
//
//    @Bean(name = "transactionManager")
//    public DataSourceTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }

}
