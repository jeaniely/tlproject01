package com.neuedu.springbootmybatis.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class MyScheduled {
    Logger logger= LoggerFactory.getLogger(MyScheduled.class);
    private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    @Scheduled(cron = "0/2 * * * * ?")
    public  void printTime(){
        logger.info(sdf.format(new Date()));
    }
}
