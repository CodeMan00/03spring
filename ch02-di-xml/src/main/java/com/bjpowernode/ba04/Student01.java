package com.bjpowernode.ba04;

/**
 * @author gjd
 * @create 2021/10/3  09:58:46
 */
public class Student01 {

    private String name;
    private int age;

    //声明一个引用类型
    private School school;

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
