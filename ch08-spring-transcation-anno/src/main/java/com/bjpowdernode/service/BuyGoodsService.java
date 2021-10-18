package com.bjpowdernode.service;

import org.springframework.stereotype.Service;

/**
 * @author gjd
 * @create 2021/10/15  10:13:01
 */
@Service
public interface BuyGoodsService {

    /***
     * 购买商品
     * @param goodsId  商品的id
     * @param nums     购买数量
     */
    void buy(Integer goodsId,Integer nums);
}
