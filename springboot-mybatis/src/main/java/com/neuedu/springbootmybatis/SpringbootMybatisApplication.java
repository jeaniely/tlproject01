package com.neuedu.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ctrl+alt+o 进行未用导入包的清理
 */
/*@EnableScheduling*/
@SpringBootApplication
@MapperScan(basePackages = "com.neuedu.springbootmybatis.dao")
public class SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
