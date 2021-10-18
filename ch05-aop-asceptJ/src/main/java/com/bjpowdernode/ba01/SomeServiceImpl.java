package com.bjpowdernode.ba01;

/**
 * @author gjd
 * @create 2021/10/5  16:18:05
 */

//目标类
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, Integer age) {
        System.out.println("目标方法doSome()执行了！！");
    }
}

