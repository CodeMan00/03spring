package com.bjpowdernode.utils;

import java.util.Date;

/**
 * @author gjd
 * @create 2021/10/4  12:00:40
 */
public class ServiceUtils {

    public static void doLog(){

        System.out.println("执行时间："+new Date());
    }

    public static void doTrans(){
        System.out.println("执行完方法，完成事务");
    }
}
