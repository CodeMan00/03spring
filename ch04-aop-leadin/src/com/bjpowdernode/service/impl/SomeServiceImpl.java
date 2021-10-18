package com.bjpowdernode.service.impl;

import com.bjpowdernode.service.SomeService;

/**
 * @author gjd
 * @create 2021/10/4  11:59:33
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("doSome方法执行了！！！！");
    }

    @Override
    public void doOther() {
        System.out.println("doOther方法执行了！！！！");
    }
}
