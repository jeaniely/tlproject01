package com.neuedu.controller;

import com.neuedu.bean.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
/*@RequestMapping("map")*/
public class MyController {

    /**
     * 使用@RequestMapping中，添加参数method = RequestMethod.GET
     * 相当于  @GetMapping
     *     method = RequestMethod.POST==>@PostMappring调用
     *
     *
      * @return
     */

    @RequestMapping(value="/success",name="s",method = RequestMethod.POST)
    public String hello(){
        return "success";// /web/success.jsp
    }

    @GetMapping("/user")
    public String param(String name,String pwd){
        System.out.println(name+" ,"+pwd);
        return "success";
    }

    @GetMapping("/user2")
    public String user(Users users){
        System.out.println(users);
        return "success";
    }
    /*请求转发、重定向的区别*/

    /*显示登录界面*/

    @GetMapping("login")
    public String login(){
        return "login";
    }
/*  解决的是传入的数据name值和控制参数不一致的时候
*   或者控制参数不一定需要的时候
* */
    @PostMapping("loginServer")
    public String loginServer(@RequestParam(value = "username",required = false) String name,
                              @RequestParam("password") String pwd){
        System.out.println(name+","+pwd);
        return "success";
    }
/*使用json传值到界面
*
* 直接传String对象，springmvc能够识别，
* 导入json的相关依赖，识别自定义的类
* */

    @GetMapping("get")
    @ResponseBody
     public Users get(){
        Users users=new Users();
        users.setName("1111");
        users.setPwd("1ddfdfdf");
         return users;
     }

    @PostMapping("loginServer02")
    @ResponseBody
    public Users loginServer02(@RequestParam(value = "username",required = false) String name,
                              @RequestParam("password") String pwd){

        Users users=new Users();
        users.setName(name);
        users.setPwd(pwd);
        return users;
    }

    /**/
    @GetMapping("login02")
    public String login02(){
        return "login02";
    }

   /* @PostMapping("loginServer03")
    @ResponseBody
    public Users loginServer03(@RequestBody Users users){
        System.out.println(users);
        return users;
    }*/
    @PostMapping("loginServer03")
    @ResponseBody
    public Users loginServer03( Users users){
        System.out.println(users);
        return users;
    }
}
