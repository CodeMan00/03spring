package com.bjpowdernode.dao;

import com.bjpowdernode.domain.Goods;
import org.springframework.stereotype.Repository;

/**
 * @author gjd
 * @create 2021/10/15  09:56:45
 */

@Repository
public interface GoodsDao {

    /**
     *  更新库存
     * @param goods  表示本次购买的商品信息
     * @return  sql影响的行数
     */
    int updateGoods(Goods goods);

    /**
     * 查询商品信息
     * @param id  商品的id
     * @return
     */
    Goods selectGoods(Integer id);
}
