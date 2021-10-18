package com.bjpowdernode.ba02;

import org.springframework.stereotype.Component;

/**
 * @author gjd
 * @create 2021/10/3  13:33:48
 */

public class Student {

    private String name;
    private int age;

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
                '}';
    }
}
