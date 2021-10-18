package com.bjpowdernode.ba08;

import com.bjpowdernode.ba02.Student;

/**
 * @author gjd
 * @create 2021/10/5  16:16:37
 */
public interface SomeService {

    void doSome(String name,Integer age);

    String doOther(String name,Integer age);

    Student doStu(String name, Integer age);

    String doFirst(String name,Integer age);

    void doSecond();

    void doAfter();
}
