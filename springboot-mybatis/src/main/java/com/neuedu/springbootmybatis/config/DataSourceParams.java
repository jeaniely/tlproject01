package com.neuedu.springbootmybatis.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*@Data
@Component
@ConfigurationProperties(prefix = "ds.datasource")*/
public class DataSourceParams {
    /* @Value("${ds.datasource.url}")*/
    private String url;

    /*@Value("${ds.datasource.username}")*/
    private String username;

    /*@Value("${ds.datasource.password}")*/
    private String password;

    /*@Value("${ds.datasource.driverClassName}")*/
    private String driverClassName;

    /*@Value("${ds.datasource.initialSize}")*/
    private Integer initialSize;

    /* @Value("${ds.datasource.minIdle}")*/
    private Integer minIdle;
    /* @Value("${ds.datasource.maxActive}")*/
    private Integer maxActive;
    /*@Value("${ds.datasource.maxWait}")*/
    private Long maxWait;
    /*@Value("${ds.datasource.timeBetweenEvictionRunsMillis}")*/
    private Long timeBetweenEvictionRunsMillis;
    /*@Value("${ds.datasource.minEvictableIdleTimeMillis}")*/
    private Long minEvictableIdleTimeMillis;
}
