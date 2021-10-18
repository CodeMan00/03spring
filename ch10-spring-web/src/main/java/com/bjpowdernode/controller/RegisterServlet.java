package com.bjpowdernode.controller;

import com.bjpowdernode.StudentService;
import com.bjpowdernode.domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gjd
 * @create 2021/10/15  22:19:00
 */
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String age = request.getParameter("age");

        //创建spring容器对象
        String config = "applicationContext.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        StudentService bean = context.getBean(StudentService.class);

        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setAge(Integer.valueOf(age));
        bean.insertStudent(student);

        //给一个页面
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
