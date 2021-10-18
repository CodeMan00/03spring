package com.bjpowdernode.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
     *  后置通知定义方法，方法是实现切面功能的。
     *
     *  方法的定义要求：
     *      1.公共方法public
     *      2.方法没有返回值
     *      3.方法名称自定义
     *      4.方法可以有参数
     */

    /**
     *  后置通知：
     *     属性：
     *        1.value 切入点表达式
     *        2.returning 自定义的变量，表示目标方法的返回值。
     *          自定义变量名必须和通知方法的形参名一样。
     *     位置：
     *          在方法之后执行的
     *     特点：
     *        1.在目标方法之后执行
     *        2.能够获取到目标方法的返回值，可以根据这个返回值做不同的处理。
     *        3.返回值能够修改。
     *              如果返回值是引用类型：我们对其修改，会保存修改，对原返回值会有影响
     *              如果返回值是值传递，传递回来的是一个备份，我们对其修改，不会保存修改，对原返回值不会有影响。
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doOther(..))",returning = "res")
    public void myAfterReturing(Object res){
        System.out.println("后置通知：在目标方法之后执行的，获取到的返回值是："+res);
    }


    @AfterReturning(value = "execution(* *..SomeServiceImpl.doStu(..))",returning = "res")
    public void myAfterReturing1(Object res){
        Student student = (Student) res;
        student.setName("qinghua");
        student.setAge(33);
        System.out.println("后置通知：在目标方法之后执行的，获取到的返回值是："+res);
    }
}
