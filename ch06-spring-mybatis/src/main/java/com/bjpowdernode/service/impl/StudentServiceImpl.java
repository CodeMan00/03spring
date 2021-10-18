package com.bjpowdernode.service.impl;

import com.bjpowdernode.dao.StudentDao;
import com.bjpowdernode.domain.Student;
import com.bjpowdernode.service.StudentService;

import java.util.List;

/**
 * @author gjd
 * @create 2021/10/10  18:15:32
 */
public class StudentServiceImpl implements StudentService {

    private StudentDao dao;

    //使用set注入赋值
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }


    @Override
    public int addStudent(Student student) {

        int rows = dao.insertStudent(student);
        return rows;
    }

    @Override
    public List<Student> queryStudent() {

        List<Student> students = dao.selectStudents();
        return students;
    }
}
