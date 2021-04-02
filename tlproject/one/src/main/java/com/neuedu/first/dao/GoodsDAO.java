package com.neuedu.first.dao;

import com.neuedu.first.bean.Googs;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsDAO {
/*
*  使用注解形式
* */
    @Select("select id,gnumber,name,price,sellnumber,stock,ifdelete,classid,createtime,updatetime from googs_t")
    public List<Googs> getAll();

    @Select("select id,gnumber,name,price,sellnumber,stock,ifdelete,classid,createtime,updatetime from googs_t where id=#{id}")
    public Googs getOne(Integer id);
/*'%${name}%'*/
    @Select("select id,gnumber,name,price,sellnumber,stock,ifdelete,classid,createtime,updatetime from googs_t where name like #{name}")
    public List<Googs> getByName(String name);

    @Insert("insert into \n" +
            "googs_t(gnumber,name,price,sellnumber,stock,ifdelete,classid,described,createtime,updatetime)\n" +
            "values(#{gnumber},#{name},#{price},0,#{stock},0,#{classid},#{described},NOW(),NOW())")
    public Integer insert(Googs googs);


}
