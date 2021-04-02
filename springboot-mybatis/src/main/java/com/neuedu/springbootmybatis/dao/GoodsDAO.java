package com.neuedu.springbootmybatis.dao;

import com.neuedu.springbootmybatis.pojo.Goods;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsDAO {

    /**
     * 实现所有商品的提取
     * @return
     */
    @Select("select id,gnumber,name,price,sellnumber,stock,ifdelete,classid,createtime,updatetime from googs_t")
    public List<Goods> selectALL();

    /**
     * 根据商品编号提取数据
     * @param gnumber
     * @return
     */
    @Select("select id,gnumber,name,price,sellnumber,stock,ifdelete,classid,createtime,updatetime from googs_t where gnumber=#{gnumber}")
    public Goods selectOneByNumber(String gnumber);

    /**
     * 添加数据
     * @param goods
     * @return
     */
    @Insert("insert into \n" +
            "googs_t(gnumber,name,price,sellnumber,stock,ifdelete,classid,described,createtime,updatetime)\n" +
            "values(#{gnumber},#{name},#{price},0,#{stock},0,#{classid},#{described},NOW(),NOW())")
    public Integer add(Goods goods);

    /**
     * 根据名字将进行模糊查询
     * @param name
     * @return
     */
    /* @Select("select id,gnumber,name,price,sellnumber,stock,ifdelete,classid,createtime,updatetime from googs_t where name like #{name}")*/
    @Select("select id,gnumber,name,price,sellnumber,stock,ifdelete,classid,createtime,updatetime from googs_t where name like '%${name}%'")
    public List<Goods> selectByName(String name);



    @Delete("delete from googs_t where id=#{id}")
    public Integer delete(Integer id);

    @Delete("update googs_t set name=#{name} where id=#{id}")
    public Integer update(Goods goods);

    @Select("select id,gnumber,name,price,sellnumber,stock,ifdelete,classid,createtime,updatetime from googs_t where classid=#{classid}")
    public List<Goods> selectByClassid(Integer classid);

}
