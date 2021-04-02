package com.neuedu.springbootmybatis.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*@Configuration*/
public class WebConfigurer implements WebMvcConfigurer {
    @Autowired
    MyInterceptor myInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration=registry.addInterceptor(myInterceptor);
        registration.addPathPatterns("/**").excludePathPatterns("/login","/login.html","/login.jsp");
    }
}
