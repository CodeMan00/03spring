package com.bjpowdernode.ba04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * @author gjd
 * @create 2021/10/5  16:19:23
 */

@Aspect
public class MyAspectJ {

    /***
     *    异常通知方法的定义格式：
     *     1.public
     *     2.没有返回值
     *     3.方法名称自定义
     *     4.方法参数是Exception，另一个就是JointPoint，可有可无
     */

    /**
     * @AfterThrowing：异常通知
     *        属性：
     *          1.value 切入点表达式
     *          2.throwing  自定义变量，表示目标方法抛出的异常对象。
     *                  变量名要和方法的参数名一致。
     *
     *       特点：
     *          1. 在目标方法抛出异常时执行的。
     *          2.可以做异常的监控程序，监控目标方法执行时是不是有异常。
     *              如果有异常，可以发送短信或邮件，进行通知。
     */
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond())",throwing = "ex")
    public void MyAfterThrowing(Exception ex){

        System.out.println("异常通知：发生异常时，该方法执行...."+ex.getMessage());

        //发送邮件和短信通知开发人员
    }
}
