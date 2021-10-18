package com.bjpowdernode.service.impl;

import com.bjpowdernode.dao.GoodsDao;
import com.bjpowdernode.dao.SaleDao;
import com.bjpowdernode.domain.Goods;
import com.bjpowdernode.domain.Sale;
import com.bjpowdernode.exception.NoEnoughException;
import com.bjpowdernode.service.BuyGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
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

    /**
     * 注解@Transcational定义的属性其实都是默认的,可以不写.
     *  但是如果我们不想使用默认的值,可以进行修改属性值.
     *
     * @Transcational 也可以定义到类上,表示这个类中的所有方法都进行事务处理.
     *
     *
     * rollbackFor：表示发生指定的异常后，一定回滚
     *  处理逻辑：
     *      1）spring框架会首先检查方法抛出的异常是不是在rollbackFor的属性值中，
     *          如果异常在rollbackFor异常中，不管是什么异常，一定会回滚。
     *      2）如果你抛出的异常不在rollbackFor列表中，spring会判断异常是不是
     *          RuntimeException异常，如果是一定回滚。
     *
     */
//    @Transactional(
//            propagation = Propagation.REQUIRED,
//            isolation = Isolation.DEFAULT,
//            readOnly = false,
//            rollbackFor = {
//                    NullPointerException.class,
//                    NoEnoughException.class
//            })
    @Transactional
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
