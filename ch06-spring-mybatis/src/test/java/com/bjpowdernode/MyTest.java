package com.bjpowdernode;

import com.bjpowdernode.dao.StudentDao;
import com.bjpowdernode.domain.Student;
import com.bjpowdernode.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author gjd
 * @create 2021/10/10  18:38:51
 */
public class MyTest {

    @Test
    public void test(){

        String config = "applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        //获取Dao对象
        StudentDao bean = (StudentDao) context.getBean("studentDao");

        int rows = bean.insertStudent(new Student("杰克", "jieke@qq.com", 22));

        System.out.println(rows > 0 ? "插入成功!" : "插入失败!");
    }

    /**
     * 通过service进行插入学生记录
     */
    @Test
    public void testServiceInsert(){

        String config = "applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        //获取service对象
        StudentService studentService = (StudentService) context.getBean("studentService");
        //spring和mybatis整合后事务是自动提交的
        int rows = studentService.addStudent(new Student("孔子", "kongzi@qq.com", 33));

        System.out.println(rows > 0 ? "插入成功!":"插入失败!");
    }

    @Test
    public void testServiceQuery(){

        String config = "applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        //获取service对象
        StudentService studentService = (StudentService) context.getBean("studentService");

        List<Student> students = studentService.queryStudent();

        students.forEach(student -> System.out.println(student));
    }
}
