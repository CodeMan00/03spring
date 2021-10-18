package com.bjpowdernode.ba08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author gjd
 * @create 2021/10/3  13:33:48
 */

@Component
public class Student {

    /***
     *   从配置文件中读取信息并赋值
     */
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;


    @Resource(name = "school")
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
