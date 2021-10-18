package com.bjpowdernode;

import com.bjpowdernode.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gjd
 * @create 2021/10/15  10:47:53
 */
public class MyTest {

    @Test
    public void test(){

        String configLocation = "applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        //从容器获取对象
        BuyGoodsService goodsService = (BuyGoodsService) context.getBean("buyService");

        goodsService.buy(1006,20);

    }
}
