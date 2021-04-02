package com.neuedu.springbootmybatis.result.exception;


import com.neuedu.springbootmybatis.result.type.CodeType;
import lombok.Getter;

@Getter
public class MyException extends RuntimeException {
    private Integer code;

    /**
     * 已经定义的异常
     * @param type
     */
    public MyException(CodeType type){
        super(type.getMsg());
        this.code=type.getCode();
    }

    /**
     *  自定义错误类型
     * @param code
     * @param msg
     */
    public MyException(Integer code,String msg){
        super(msg);
        this.code=code;
    }
}
