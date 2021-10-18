package com.bjpowdernode.test;

import com.bjpowdernode.handler.MyInvocationHandler;
import com.bjpowdernode.service.SomeService;
import com.bjpowdernode.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author gjd
 * @create 2021/10/4  12:03:09
 */

public class MyTest {

    public static void main(String[] args) {

        //创建目标对象
        SomeService target = new SomeServiceImpl();

        //创建InvocationHandler
        InvocationHandler handler = new MyInvocationHandler(target);

        //使用Proxy创建代理
        SomeService proxy  = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);

        //通过代理执行方法，会调用handler中的invoke方法
        proxy.doOther();
        proxy.doSome();
    }
}
