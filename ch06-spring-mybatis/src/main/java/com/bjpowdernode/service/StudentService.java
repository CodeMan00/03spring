package com.bjpowdernode.service;

import com.bjpowdernode.domain.Student;

import java.util.List;

/**
 * @author gjd
 * @create 2021/10/10  18:14:22
 */
public interface StudentService {

    int addStudent(Student student);

    List<Student> queryStudent();
}
