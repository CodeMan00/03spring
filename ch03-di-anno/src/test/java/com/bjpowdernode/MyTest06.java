package com.bjpowdernode;

import com.bjpowdernode.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gjd
 * @create 2021/10/3  13:52:58
 */
public class MyTest06 {

    @Test
    public void test(){

        String config = "applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student student = (Student) context.getBean("student");

        System.out.println(student);
    }
}
