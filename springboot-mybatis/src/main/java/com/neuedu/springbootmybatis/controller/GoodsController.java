package com.neuedu.springbootmybatis.controller;

import com.neuedu.springbootmybatis.result.exception.MyException;
import com.neuedu.springbootmybatis.result.responsebean.Response;
import com.neuedu.springbootmybatis.result.type.CodeType;
import com.neuedu.springbootmybatis.service.GoodsManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class GoodsController {
    @Autowired
    private GoodsManagerService goodsManagerService;

    /**
     * 为了使结果更加清晰，
     *   成功返回，1）带数据的成功返回，
     *           2）不带数据的成功返回，
     *   失败返回：失败原因
     *  设计： 返回数据对象
     *        1） 状态码  1XX 登录状态，3XX 商品状态，6XX 订单状态
     *        2） T data 数据对象--成功的时候返回实际对象，
     *        3） 提示信息：
     *    失败的时候，信息如何返回--使用自定异样
     *
     *
     * @param parentid
     * @param childname
     * @return
     */
    @PostMapping("/addchildtype")
    public Response addChildType(HttpSession session,Integer parentid, String childname){
        String name=(String) session.getAttribute("name");
        if(name==null ){
            throw new MyException(CodeType.USER_ERROR);
        }
       return  goodsManagerService.addChildType(parentid,childname);
    }

    @GetMapping("/findGoodsByClassid")
    @CrossOrigin
    public Response findGoodsByClassid(Integer classid,
                                       @RequestParam(defaultValue = "1",required = false) Integer pageNum,
                                       @RequestParam(defaultValue = "1",required = false) Integer pageSize){
        return  goodsManagerService.findByClass(classid,pageNum,pageSize);
    }
    /**
     *  有一些操作，需要登录之后才能操作，查看是否登录，使用HttpSession
     *
     *  在session中存入name值，但name不为空时，表示登录成功，name为空时未登录
     *
     */
    @PostMapping("/login")
    public  String login(HttpSession session,String name){

        session.setAttribute("name",name);
        return name;
    }
    @GetMapping("/login.html")
    public  String loginpage(){
        return "登录界面";
    }

}
