package com.bjpowdernode.dao;
import com.bjpowdernode.domain.Sale;
import org.springframework.stereotype.Repository;

/**
 * @author gjd
 * @create 2021/10/15  09:56:16
 */

@Repository
public interface SaleDao {

    //增加销售记录
    int insertSale(Sale sale);
}
