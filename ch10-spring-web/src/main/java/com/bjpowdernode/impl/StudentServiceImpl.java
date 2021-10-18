package com.bjpowdernode.impl;

import com.bjpowdernode.StudentService;
import com.bjpowdernode.dao.StudentDao;
import com.bjpowdernode.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author gjd
 * @create 2021/10/15  21:54:01
 */
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int insertStudent(Student student) {

        return studentDao.addStudent(student);
    }
}
