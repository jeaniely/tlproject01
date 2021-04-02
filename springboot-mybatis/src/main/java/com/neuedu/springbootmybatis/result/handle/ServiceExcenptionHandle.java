package com.neuedu.springbootmybatis.result.handle;

import com.neuedu.springbootmybatis.result.exception.MyException;
import com.neuedu.springbootmybatis.result.responsebean.Response;
import com.neuedu.springbootmybatis.result.responseutil.ResponseUtil;
import com.neuedu.springbootmybatis.result.type.CodeType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ServiceExcenptionHandle {

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public Response handle(MyException e){
        return ResponseUtil.error(CodeType.getByCodeObject(e.getCode()),false);
    }
}
