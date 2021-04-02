package com.neuedu.springbootmybatis.dao;

import com.neuedu.springbootmybatis.pojo.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TypeDAO {
    /**
     *  提取类型
     * @return
     */
    @Select("select  classid,name,parentid,leveld,ifleaf,described from type_t")
    public List<Type> selectAll();

    /**
     * 提取相同父类中的字类
     * @param parentId
     * @return
     */
    @Select("select  classid,name,parentid,leveld,ifleaf,described from type_t"
            +" where parentid=#{parentId}")
    public List<Type> selectByParentId(Integer parentId);

    /**
     *  根据类型号进行查询
     * @param classid
     * @return
     */
    @Select("select  classid,name,parentid,leveld,ifleaf,described from type_t"
            +" where classid=#{classid}")
    public Type selectByClassid(Integer classid);

    /**
     * 根据类型名进行查询
     * @param name
     * @return
     */
    @Select("select  classid,name,parentid,leveld,ifleaf,described from type_t"
            +" where name=#{name}")
    public Type selectByName(String name);

    /**
     * 添加类型
     * @param type
     * @return
     */
    @Insert("insert into type_t (name,parentid,leveld,ifleaf,described) "+
            " values(#{name},#{parentid},#{leveld},#{ifleaf},#{described})")
    public Integer add(Type type);

    /**
     *  对类型名进行修改
     * @param type
     * @return
     */
    @Update("update type_t set name=#{name} where classid=#{classid}")
    public Integer updateName(Type type);

    /**
     * 对是否是叶子节点进行修改
     * @param type
     * @return
     */
    @Update("update type_t set ifleaf=#{ifleaf} where classid=#{classid}")
    public Integer updateIfLeaf(Type type);

    /**
     * 根据类型号进行删除
     * @param classid
     * @return
     */
    @Delete("delete from type_t  classid=#{classid}")
    public Integer deleteByClassid(Integer classid);

    /**
     * 根据父类号，进行删除，也就是删除子类层
     * @param parentId
     * @return
     */
    @Delete("delete from type_t  parentId=#{parentId}")
    public Integer deleteByClParentid(Integer parentId);

}
