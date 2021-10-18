package com.bjpowdernode.ba07;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author gjd
 * @create 2021/10/5  16:19:23
 */

@Aspect
public class MyAspectJ {


    @After(value = "mypt()")
    public void myAfter(){

        System.out.println("最终通知方法执行了.....   myAfter该方法执行了.....");
        //下面一般做一些资源释放的工作
    }

    @Before(value = "mypt()")
    public void myBefore(){

        System.out.println("前置通知方法执行了.....   myBefore该方法执行了.....");
        //下面一般做一些资源释放的工作
    }

    /**
     * @Pointcut：定义和管理切入点，如果你的项目中有多个相同的切入点，那么为了防止重复代码，可以使用@Pointcut
     *
     * 属性； value 切入点表达式
     * 位置：在自定义方法上面
     *
     * 特点：
     *  当使用@Pointcut定义在一个方法的上面，此时这个方法的名称就是切入点表达式的别名。
     *  其他的通知中，value属性就可以使用这个方法名称，代替切入点表达式了。
     *  一般我们把该方法的访问修饰符设置为私有，只在内部使用，无需被外接调用。
     */
    @Pointcut(value ="execution(* *..SomeServiceImpl.doSome(..))" )
    private void mypt(){
        //无需代码
    }
}
