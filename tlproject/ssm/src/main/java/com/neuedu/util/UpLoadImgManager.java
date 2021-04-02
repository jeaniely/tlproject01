package com.neuedu.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class UpLoadImgManager {

    public static String getOneFile(MultipartFile imgfile,String uploadfile){

        String oldname=imgfile.getOriginalFilename();
        System.out.println(oldname);
        /*新名字*/
        String newfile= UUID.randomUUID().toString()+oldname.substring(oldname.lastIndexOf("."));
        try {
            imgfile.transferTo(new File(uploadfile+"/"+newfile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newfile;
    }

    public static String getMultFile(MultipartFile[] ifiles,String uploadfile){
        String newfiles="";
        for(MultipartFile file:ifiles){
            String oldname=file.getOriginalFilename();
            System.out.println(oldname);
            /*新名字*/
            String newfile= UUID.randomUUID().toString()+oldname.substring(oldname.lastIndexOf("."));
            try {
                file.transferTo(new File(uploadfile+"/"+newfile));
            } catch (IOException e) {
                e.printStackTrace();
            }
            newfiles+=newfile+";";
        }

        return newfiles;
    }
}
