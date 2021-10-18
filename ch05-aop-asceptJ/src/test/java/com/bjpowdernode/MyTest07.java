package com.bjpowdernode;

import com.bjpowdernode.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gjd
 * @create 2021/10/5  16:40:07
 */
public class MyTest07 {

    @Test
    public void test(){

        String config = "applicationContext.xml";

        //创建spring容器
        ApplicationContext context = new
                ClassPathXmlApplicationContext(config);

        //从容器中取出代理对象
        SomeServiceImpl bean = (SomeServiceImpl) context.getBean("someService");

        //通过代理对象执行方法，实现目标方法执行时，增强了功能。
        bean.doSome("zhangsan",33);


        /**
         *  目标类没有接口，使用cglib动态代理，spring框架会自动应用cglib
         *  com.bjpowdernode.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$a88e0b31
         */
        System.out.println(bean.getClass().getName());
    }
}
