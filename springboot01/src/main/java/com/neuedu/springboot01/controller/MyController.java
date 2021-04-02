package com.neuedu.springboot01.controller;

import com.neuedu.springboot01.bean.Student;
import com.neuedu.springboot01.bean.Users;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController//@Controller+@ResponseBody
public class MyController {

    @GetMapping("/index")
    public String index(){
        return "hello,student";
    }

    @PostMapping("/index")
    public String testByName(String name){
        return name;
    }

    @PostMapping("/user")
    public Users testByObject(Users users){
        return users;
    }

    /*路径传值*/
    @GetMapping ("/index/{name}")
    public String pathByName(@PathVariable String name){
        return name;
    }


    @PutMapping("/put")
    public String put(){
        return "put";
    }
    @DeleteMapping("/delete")
    public String delete(){
        return "delete";
    }

    @PatchMapping("/patch")
    public String patch(){
        return "patch";
    }
/*
@RequestParam:1)传入参数名和接受的参数名不一样的时候
              2)参数可以传值过来，也可以不用传值的管理，使用的required = false

*   */
    @GetMapping("/test")
    public Users testByName02(@RequestParam(value = "username") String name,
                             @RequestParam(required = false,defaultValue = "23",value = "password") String pwd){
        Users users=new Users();
        users.setName(name);
        users.setPwd(pwd);

        return users;
    }

/* 测试第三方依赖fastjson
* */
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("tom",23,new Date());
    }



}
