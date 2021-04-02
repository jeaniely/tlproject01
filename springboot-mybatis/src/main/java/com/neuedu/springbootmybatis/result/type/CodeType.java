package com.neuedu.springbootmybatis.result.type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * 使用枚举来列举出状态码和提示信息
 */

@Getter
@AllArgsConstructor
public enum CodeType {
    USER_ERROR(100,"用户未登录"),
    USER_SUCCESS(100,"用户登录成功"),
    USER_ERROR_USERNAME(101,"用户名有误"),
    TYPE_SUCCESS_SELECT(300,"商品类型查询正确"),
    TYPE_SUCCESS_ADD(302,"商品类型添加子类成功正确"),
    TYPE_ERROR_SELECT_ID(301,"根据id查询商品类型有误"),
    GOODS_ERROR_SELECT_TPYEID(351,"类型查询无数据"),
    GOODS_SUCCESS_SELECT_TPYEID(352,"类型查询商品数据成功")
    ;


    private int code;
    private String msg;

    public static String getByCode(int code){
        for(CodeType codeType:CodeType.values()){
            if(codeType.getCode()==code){
                return codeType.getMsg();
            }
        }
        return null;
    }
    public static int getByMsg(String msg){
        for(CodeType codeType:CodeType.values()){
            if(codeType.getMsg().equals(msg)){
                return codeType.getCode();
            }
        }
        return 0;
    }

    public static CodeType getByCodeObject(int code){
        for(CodeType codeType:CodeType.values()){
            if(codeType.getCode()==code){
                return codeType;
            }
        }
        return null;
    }
}
