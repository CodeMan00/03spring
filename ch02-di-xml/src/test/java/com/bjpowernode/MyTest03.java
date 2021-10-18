package com.bjpowernode;

import com.bjpowernode.ba03.Student01;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

/**
 * @author gjd
 * @create 2021/10/3  09:07:52
 */
public class MyTest03 {

    @Test
    public void test(){

        String config = "ba03/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student01 student = (Student01) context.getBean("student");
        System.out.println(student);


        Student01 student01 = (Student01) context.getBean("student01");
        System.out.println(student01);

        Student01 student02 = (Student01) context.getBean("student02");
        System.out.println(student02);

        File file = (File) context.getBean("file");
        System.out.println(file.getName());
    }
}
