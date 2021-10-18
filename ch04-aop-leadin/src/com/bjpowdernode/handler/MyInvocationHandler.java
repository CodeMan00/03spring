package com.bjpowdernode.handler;

import com.bjpowdernode.utils.ServiceUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gjd
 * @create 2021/10/4  11:55:21
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    //通过代理对象执行方式时，会调用执行这个invoke方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

       Object res= null;
       //执行目标类的方法，通过Method类实现
       res = method.invoke(target,args);

       //对原方法的增强部分
        ServiceUtils.doLog();
        ServiceUtils.doTrans();


        return res;
    }
}
