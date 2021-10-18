package com.bjpowernode.ba03;

import com.bjpowernode.ba01.Student;

/**
 * @author gjd
 * @create 2021/10/3  09:58:46
 */
public class Student01 {

    private String name;
    private int age;

    //声明一个引用类型
    private School school;

    Student01(){
        System.out.println("这是Student类的无参构造方法！！！");
    }

    Student01(String name, int age,School school){
        System.out.println("student01的有参构造方法!!!");
        this.name = name;
        this.age = age;
        this.school = school;
    }


    public void setSchool(School school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
