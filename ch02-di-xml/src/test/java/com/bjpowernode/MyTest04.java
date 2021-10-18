package com.bjpowernode;

import com.bjpowernode.ba04.Student01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @author gjd
 * @create 2021/10/3  09:07:52
 */
public class MyTest04 {

    @Test
    public void test(){

        String config = "ba04/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student01 student = (Student01) context.getBean("student");
        System.out.println(student);

    }
}
