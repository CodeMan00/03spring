package com.bjpowdernode.ba06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author gjd
 * @create 2021/10/3  13:33:48
 */

@Component
public class Student {

    @Value("周强")
    private String name;
    @Value("22")
    private int age;

    /**
     * 引用类型：
     *  使用@Resource:来自jdk中的注解，spring框架提供了对这个注解的功能的支持，可以使用它给引用类型赋值，
     *  使用的也是自动注入原理，支持byName，byType，默认是byName
     *
     *  位置；
     *      1.定义在属性上，无需set方法，推荐使用
     *      2.定义在set方法上。
     */
    //默认是byName:显示byName自动注入，如果注入失败，在使用byType
    @Resource
    private School school;

    Student(){
        System.out.println("Student无参构造方法被调用了！！！");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
