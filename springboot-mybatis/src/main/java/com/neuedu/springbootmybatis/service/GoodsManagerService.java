package com.neuedu.springbootmybatis.service;

import com.neuedu.springbootmybatis.pojo.Goods;
import com.neuedu.springbootmybatis.result.responsebean.Response;

import java.util.List;

public interface GoodsManagerService {
    /**
     * 给某个父类，添加字类
     * @param parentid
     * @return
     */
    public Response addChildType(Integer parentid, String childname);

    /**
     *  根据类型查找商品
     * @param classid
     * @return
     */
    public Response<List<Goods>> findByClass(Integer classid,Integer pageNum,Integer pageSize);

}
