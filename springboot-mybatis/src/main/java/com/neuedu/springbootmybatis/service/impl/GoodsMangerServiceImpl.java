package com.neuedu.springbootmybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.neuedu.springbootmybatis.dao.GoodsDAO;
import com.neuedu.springbootmybatis.dao.TypeDAO;
import com.neuedu.springbootmybatis.pojo.Goods;
import com.neuedu.springbootmybatis.pojo.Type;
import com.neuedu.springbootmybatis.result.exception.MyException;
import com.neuedu.springbootmybatis.result.responsebean.Response;
import com.neuedu.springbootmybatis.result.responseutil.ResponseUtil;
import com.neuedu.springbootmybatis.result.type.CodeType;
import com.neuedu.springbootmybatis.service.GoodsManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsMangerServiceImpl  implements GoodsManagerService {

    @Autowired
    private TypeDAO typeDAO;

    @Autowired
    private GoodsDAO goodsDAO;


    @Transactional
    @Override
    public Response addChildType(Integer parentid, String childname) {
        // 父类对象数据
        Type parent=typeDAO.selectByClassid(parentid);
        if(parent==null){
            throw new MyException(CodeType.TYPE_ERROR_SELECT_ID);
        }

        // 字类对象的数据
        Type child=new Type();
        child.setName(childname);
        child.setParentid(parentid);
        child.setIfleaf(0);
        child.setLeveld(parent.getLeveld()+1);

        // 查看父类是否是叶子节点
        if(parent.getIfleaf()==0){
            parent.setIfleaf(1);
            typeDAO.updateIfLeaf(parent);
        }
        // 添加孩子节点
        typeDAO.add(child);
        return ResponseUtil.success(CodeType.TYPE_SUCCESS_ADD,true);
    }

    /**
     * 使用分页显示数据
     * @param classid
     * @param pageNum 第几页
     * @param pageSize 每个条数
     * @return
     */
    @Override
    public Response<List<Goods>> findByClass(Integer classid,Integer pageNum,Integer pageSize) {
            PageHelper.startPage(pageNum,pageSize);
            List<Goods> goodsList=goodsDAO.selectByClassid(classid);
            if(goodsList==null ||goodsList.size()==0){
                throw new MyException(CodeType.GOODS_ERROR_SELECT_TPYEID);
            }

        return ResponseUtil.success(CodeType.GOODS_SUCCESS_SELECT_TPYEID,goodsList);
    }
}
