package com.neuedu.controller;

import com.neuedu.service.GoodsMangerService;
import com.neuedu.util.UpLoadImgManager;
import com.neuedu.val.GoodsVal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class GoodsController {

    @Autowired
    private GoodsMangerService mangerService;


    @GetMapping("googslist")
    @ResponseBody
    public List<GoodsVal> getAll(){
        return mangerService.getAll();
    }

    @RequestMapping("list")
    public String getPageGoodsList(){
        return "goodslist";
    }

    @RequestMapping("file")
    public String file(){
        return "file";
    }

    /**
     *   建议：图片文件不光要在tomcat发布的文件夹中存在，
     *       还需要创建一个备份的地方存放地方，任何地方都可以，
     *       目的，当tomcat重新部署的时候，图片文件会消失，将备份中的文件部署一下
     *
     *    关系型数据库中存放的是文件的路径+文件名或者文件名
     * @param request
     * @param imgfile
     * @return
     */

   /* @PostMapping("upload")
    @ResponseBody
    public String upload(HttpServletRequest request,MultipartFile imgfile){
        *//*存放的路径*//*
        String uploadfile=request.getSession().getServletContext().getRealPath("/upload");
        *//*判断目录是否存在,不存在创建*//*
        File file=new File(uploadfile);
        if(!file.exists()){
            file.mkdir();
        }

       *//* String backupload="D:/demo";*//*
        *//*获取文件名*//*

            String oldname=imgfile.getOriginalFilename();
            System.out.println(oldname);
            *//*新名字*//*
            String newfile= UUID.randomUUID().toString()+oldname.substring(oldname.lastIndexOf("."));



            try {
                imgfile.transferTo(new File(uploadfile+"/"+newfile));
            } catch (IOException e) {
                e.printStackTrace();
            }


        return newfile;
    }*/


    @Autowired
    HttpServletRequest request;

    @PostMapping("upload")
    @ResponseBody
    public String upload(MultipartFile imgfile,MultipartFile[] ifiles){

        String uploadfile=request.getSession().getServletContext().getRealPath("/upload");

        File file=new File(uploadfile);
        if(!file.exists()){
            file.mkdir();
        }

        System.out.println(UpLoadImgManager.getOneFile(imgfile,uploadfile));

        System.out.println(UpLoadImgManager.getMultFile(ifiles,uploadfile));

       return "success";
    }
}
