package com.bjpowdernode;

import com.bjpowdernode.ba08.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gjd
 * @create 2021/10/5  16:40:07
 */
public class MyTest08 {

    @Test
    public void test(){

        String config = "applicationContext.xml";

        //创建spring容器
        ApplicationContext context = new
                ClassPathXmlApplicationContext(config);

        //从容器中取出代理对象
        SomeService bean = (SomeService) context.getBean("someService");

        //通过代理对象执行方法，实现目标方法执行时，增强了功能。
        bean.doAfter();


        System.out.println(bean.getClass().getName());
    }
}
