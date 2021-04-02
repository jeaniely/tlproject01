package com.neuedu.service;



import com.neuedu.val.GoodsVal;

import java.util.List;

public interface GoodsMangerService {
    /**
     * 显示商品全部商品信息
     * @return
     */
    public List<GoodsVal>  getAll();



    public void trancationTest();

}
