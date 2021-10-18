package com.bjpowdernode.dao;

import com.bjpowdernode.domain.Student;

import java.util.List;

/**
 * @author gjd
 * @create 2021/10/10  18:06:26
 */
public interface StudentDao {

    int insertStudent(Student student);

    List<Student> selectStudents();
}
