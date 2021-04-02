package com.neuedu.springbootmybatis.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class MyInterceptor  implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("prehandle");
        HttpSession session = request.getSession();
       String name=(String) session.getAttribute("name");
       if(name!=null){
           return true;
       }

       response.sendRedirect("/login.html");
       return false;

    }
}
