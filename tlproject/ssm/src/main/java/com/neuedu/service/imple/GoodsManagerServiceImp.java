package com.neuedu.service.imple;


import com.neuedu.bean.Goods;
import com.neuedu.dao.GoodsDAO;
import com.neuedu.service.GoodsMangerService;
import com.neuedu.val.GoodsVal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("goodsManagerServiceImp")
public class GoodsManagerServiceImp implements GoodsMangerService {

    @Autowired
    private GoodsDAO goodsDAO;

    @Override
    public List<GoodsVal> getAll() {
        List<GoodsVal> goodsVals=new ArrayList<>();
        List<Goods> goods=goodsDAO.selectALL();
        for (Goods g:goods) {
            GoodsVal goodsVal=new GoodsVal();
            goodsVal.setId(g.getId());
            goodsVal.setStatus(g.getIfdelete()==0?"可用":"不可用");
            goodsVal.setTname("男装");//需要从分类表中根据id查询name出来，现在模拟，给一个固定值
            goodsVal.setCreatetime(g.getCreatetime());
            goodsVal.setDescribed(g.getDescribed());
            goodsVal.setGnumber(g.getGnumber());
            goodsVal.setName(g.getName());
            goodsVal.setSellnumber(g.getSellnumber());
            goodsVal.setStock(g.getStock());

            goodsVals.add(goodsVal);
        }
        return goodsVals;
    }

    @Override
    @Transactional
    public void trancationTest() {
        Goods goods=new Goods();
        goods.setName("球鞋");
        goods.setId(1);
        goodsDAO.update(goods);
        goodsDAO.delete(3);


    }
}
