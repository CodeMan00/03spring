package com.bjpowernode;

import com.bjpowernode.service.SomeService;
import com.bjpowernode.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author gjd
 * @create 2021/10/3  09:07:52
 */
public class MyTest {

    @Test
    public void test(){
        SomeService someService = new SomeServiceImpl();
        someService.doSome();
    }

    //测试spring的使用
    @Test
    public void test1(){
        /**
         *  spring对象的创建： 在创建spring容器时，会创建配置文件中所有的对象。
         */
        //使用spring容器创建对象
        //1.指定spring配置文件的名称
        String config = "beans.xml";
        //2.创建表示spring容器的对象，ApplicationContext就表示spring容器，通过这个容器对象，就可以获取到对象
        //参数就是配置文件的路径  ClassPathXmlApplicationContext就是从类路径下去加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        //从容器中获取某个对象，需要调用对象的方法   参数是配置文件中bean标签中的id属性的值
        SomeService someSerivce = (SomeService)context.getBean("someService");

        someSerivce.doSome();


    }
    /***
     *    获取spring容器中，java对象的信息
     */
    @Test
    public void test2(){

        String config = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        //通过spring提供的方法 获取容器中定义的对象数量
        int beanDefinitionCount = context.getBeanDefinitionCount();
        System.out.println("容器中的对象数量："+beanDefinitionCount);

        //容器中每个定义的对象的名称  也就是spring配置文件中bean标签的id
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String names : beanDefinitionNames){
            System.out.printf("%s\t",names);
        }
    }

    /**
     * spring创建对象，默认使用的是类的无参构造方法
     */
    @Test
    public void test4(){

        String config = "beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Date date = (Date) context.getBean("date");
        System.out.println(date);
    }
}
