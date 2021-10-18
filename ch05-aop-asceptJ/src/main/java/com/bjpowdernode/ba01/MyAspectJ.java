package com.bjpowdernode.ba01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

/**
 * @author gjd
 * @create 2021/10/5  16:19:23
 */

/***
 *  这个注解是aspectj这个框架的注解。
 *
 *  作用：表示当前类是切面类
 *
 *  切面类：用来给业务方法增加功能的类。在这个类中有切面的功能代码。
 *
 *  位置：在定义的类上面。
 */
@Aspect
public class MyAspectJ {

    /**
     *  定义方法，方法是实现切面功能的。
     *
     *  方法的定义要求：
     *      1.公共方法public
     *      2.方法没有返回值
     *      3.方法名称自定义
     *      4.方法可以有参数，也可以无参数
     *          如果有参数，参数不是自定义的，有几个参数类型，可以使用。
     */


    /**
     *  Before:前置通知注解
     *    属性：value，是切入点表达式，表示切面的功能执行的位置。
     *          注意：如果切面位置写错了，那么就不能生成代理对象。也就不能实现切面功能。
     *
     *     位置：在方法的上面。
     *    特点：
     *      1.在目标方法前执行
     *      2.改变不了目标方法的执行结果。
     *      3.也不会影响目标方法的执行。
     */

//    //下面的这种写法是完整版写法
//    @Before(value = "execution(public void com.bjpowdernode.ba01.SomeService.doSome(String,Integer))")
//    public void myBefore(){
//
//        //就是你需要增加的功能代码
//        System.out.println("前置通知，切面功能，在目标方法之前输出执行时间："+new Date());
//    }

//
//    @Before(value = "execution(void com.bjpowdernode.ba01.SomeService.doSome(String,Integer))")
//    public void myBefore(){
//
//        //就是你需要增加的功能代码
//        System.out.println("前置通知，切面功能，在目标方法之前输出执行时间："+new Date());
//    }



//    @Before(value = "execution(void *..SomeService.doSome(String,Integer))")
//    public void myBefore(){
//
//        //就是你需要增加的功能代码
//        System.out.println("前置通知，切面功能，在目标方法之前输出执行时间："+new Date());
//    }

    /**
     *    对同一个目标方法进行两次通知
     */
//    @Before(value = "execution(void *..SomeService.do*(..))")
//    public void myBefore(){
//
//        //就是你需要增加的功能代码
//        System.out.println("前置通知1，切面功能，在目标方法之前输出执行时间："+new Date());
//    }

    /**
     *  指定通知方法中的参数： joinPoint
     *   JoinPoint:业务中的方法，要加入切面功能的业务方法
     *      作用是：可以在通知方法中获取方法执行时的信息，例如方法名称，方法的实参。
     *      如果你的切面功能中需要用到方法的信息，可以在方法的参数列表中，如果参数JoinPoint
     *      这个JoinPoint参数的值是由框架赋予，必须是第一位置上的参数
     */
    @Before(value = "execution(void *..SomeService.do*(..))")
    public void myBefore1(JoinPoint joinPoint){

        //获取方法的完整定义(签名)
        System.out.println(joinPoint.getSignature());

        //获取方法的实参
        Object[] args = joinPoint.getArgs();
        for(Object arg : args){
            System.out.println("方法的参数："+arg);
        }

        //就是你需要增加的功能代码
        System.out.println("前置通知2，切面功能，在目标方法之前输出执行时间："+new Date());
    }
}
