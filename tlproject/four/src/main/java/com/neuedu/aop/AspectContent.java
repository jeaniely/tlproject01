package com.neuedu.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect /*切面*/
public class AspectContent {

    @Pointcut("execution(* com.neuedu.dao.*.*(..))") //切入点
    public void pointCut(){}

    @After("pointCut()")
    public void before(){
        System.out.println("显示时间："+new Date());
    }
}
