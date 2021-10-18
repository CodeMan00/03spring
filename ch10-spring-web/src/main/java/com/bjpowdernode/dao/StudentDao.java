package com.bjpowdernode.dao;

import com.bjpowdernode.domain.Student;
import org.springframework.stereotype.Repository;

/**
 * @author gjd
 * @create 2021/10/15  21:47:50
 */
@Repository
public interface StudentDao {

    int addStudent(Student student);
}
