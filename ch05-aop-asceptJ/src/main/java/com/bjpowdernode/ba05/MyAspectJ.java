package com.bjpowdernode.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author gjd
 * @create 2021/10/5  16:19:23
 */

@Aspect
public class MyAspectJ {

    /***
     *    最终通知方法的定义格式：
     *     1.public
     *     2.没有返回值
     *     3.方法名称自定义
     *     4.方法参数可以是JointPoint，可有可无
     */

    /**
     * @After :最终通知
     *  属性：
     *      value表示切入点表达式
     *  位置：
     *      定义在方法上面。
     *
     *  特点：
     *      1.总会执行
     *      2.在目标方法之后执行,就算是目标方法抛出了异常，该方法还是会执行，就像是
     *          finally代码块中的代码一样，总会被执行了。
     */
    @After(value = "execution(* *..SomeServiceImpl.doAfter())")
    public void myAfter(){

        System.out.println("最终通知方法执行了.....   myAfter该方法执行了.....");
        //下面一般做一些资源释放的工作
    }
}
