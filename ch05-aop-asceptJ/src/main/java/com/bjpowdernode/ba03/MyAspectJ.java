package com.bjpowdernode.ba03;

import com.bjpowdernode.ba02.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * @author gjd
 * @create 2021/10/5  16:19:23
 */

@Aspect
public class MyAspectJ {

    /**
     *  环绕通知方法的定义格式：
     *      1.public
     *      2.必须有一个返回值，推荐使用Object
     *      3.方法名称自定义
     *      4.方法有参数，固定的参数 ProceedingJoinPoint
     */

    /**
     *  @Around环绕通知：
     *      属性：1.value  切入点表达式
     *       位置： 在方法上定义。
     *
     *   特点：
     *      1.它是功能最强的通知
     *      2.在目标方法的前和后都能增强功能。
     *      3. 控制目标方法是否能被调用执行
     *      4.修改原来的目标方法的执行结果。影响最后的调用结果。
     *
     *  环绕通知，等同于jdk动态代理，InvocationHandler接口。
     *
     *  参数：ProceedingJoinPoint 用来执行目标方法.
     *  返回值：就是目标方法的执行结果，可以被修改
     *
     *  环绕通知：
     *      经常做事务，在目标方法之前开启事务，执行目标方法，在目标方法之后提交事务。
     */
    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object myAround(ProceedingJoinPoint point) throws Throwable {

        //实现环绕通知
        Object result = null;
        System.out.println("环绕通知：在目标方法之前，输出时间："+new Date());

        //1.目标方法的调用
        result = point.proceed();
        System.out.println("环绕通知：在目标方法之后，提交事务");

        //修改目标方法的执行结果
        result = "hello world!";

        return result;
    }
}
