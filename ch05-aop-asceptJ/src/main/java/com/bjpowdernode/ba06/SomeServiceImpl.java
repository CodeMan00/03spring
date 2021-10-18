package com.bjpowdernode.ba06;

import com.bjpowdernode.ba02.Student;

/**
 * @author gjd
 * @create 2021/10/5  16:18:05
 */

//目标类
public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome(String name, Integer age) {
        System.out.println("目标方法doSome()执行了！！");
    }

    @Override
    public String doOther(String name, Integer age) {

        System.out.println("目标方法doOther()执行了！！");
        return "doOther";
    }

    @Override
    public Student doStu(String name, Integer age) {
        Student student = new Student();
        student.setAge(122);
        student.setName("lisi");
        return student;
    }

    @Override
    public String doFirst(String name, Integer age) {

        System.out.println("=====doFirst方法被调用了=====");
        return "doFirst";
    }

    @Override
    public void doSecond() {

        System.out.println("执行业务方法doSecond()"+(10/0));
    }


    @Override
    public void doAfter() {
        System.out.println("doAfter方法执行了....");
    }
}

