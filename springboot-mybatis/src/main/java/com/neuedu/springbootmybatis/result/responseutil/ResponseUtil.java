package com.neuedu.springbootmybatis.result.responseutil;

import com.neuedu.springbootmybatis.result.responsebean.Response;
import com.neuedu.springbootmybatis.result.type.CodeType;

/**
 * 静态方法
 */
public class ResponseUtil {

    public static <T>  Response<T> success(CodeType type,T data){
        Response<T> response=new Response<>();
        response.setCode(type.getCode());
        response.setMsg(type.getMsg());
        response.setData(data);
        return response;
    }
    public static Response success(CodeType type){
        Response response=new Response();
        response.setCode(type.getCode());
        response.setMsg(type.getMsg());
        return response;
    }
    public static Response error(CodeType type){
        Response response=new Response();
        response.setCode(type.getCode());
        response.setMsg(type.getMsg());
        return  response;
    }
    public static <T> Response error(CodeType type,T data){
        Response response=new Response();
        response.setCode(type.getCode());
        response.setMsg(type.getMsg());
        response.setData(data);
        return  response;
    }
}
