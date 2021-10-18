package com.bjpowdernode.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author gjd
 * @create 2021/10/3  13:33:48
 */

@Component
public class Student {

    @Value("李四")
   // @Value(value = "张三")
    private String name;
    //@Value(value = "123")
    private int age;

    /**
     * 引用类型
     * @Autowired  spring框架提供的注解，实现引用类型的赋值
     * spring中通过注解给引用类型赋值，使用的是自动注入原理。支持byName，byType
     *
     * @Autowired 默认使用的是byType自动注入
     * 位置：
     *  1.定义在属性的上面，无需set方法，推荐使用
     *  2.定义在set方法上。
     *
     *
     *  如果要使用byName方式，需要做的是；
     *      1. 在属性上面加入@Autowired注解
     *      2. 在属性上面加入@Qualifier(value="bean的id") :表示使用指定名称的bean完成赋值
     *
     *   这两个注解没有先后顺序，哪个在上在下无所谓
     */

    @Qualifier(value="school")
    @Autowired
    private School school;

    Student(){
        System.out.println("Student无参构造方法被调用了！！！");
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value("33")
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
