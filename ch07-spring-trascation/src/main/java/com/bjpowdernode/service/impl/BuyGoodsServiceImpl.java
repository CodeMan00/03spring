package com.bjpowdernode.service.impl;

import com.bjpowdernode.dao.GoodsDao;
import com.bjpowdernode.dao.SaleDao;
import com.bjpowdernode.domain.Goods;
import com.bjpowdernode.domain.Sale;
import com.bjpowdernode.exception.NoEnoughException;
import com.bjpowdernode.service.BuyGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author gjd
 * @create 2021/10/15  10:17:01
 */

public class BuyGoodsServiceImpl implements BuyGoodsService {

    @Autowired
    private SaleDao saleDao;
    @Autowired
    private GoodsDao goodsDao;

    @Transactional
    @Override
    public void buy(Integer goodsId, Integer nums) {

        //1.记录销售信息，向sale表添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        //2. 更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if(goods == null){
            //商品不存在
            throw  new NullPointerException("编号为："+goodsId+"的商品不存在！");
        }else if(goods.getAmount() < nums){
            throw new NoEnoughException("编号为："+goodsId+"的商品库存不足！");
        }
        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
    }
}
