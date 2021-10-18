package com.bjpowdernode;

import com.bjpowdernode.domain.Student;
import org.springframework.stereotype.Service;

/**
 * @author gjd
 * @create 2021/10/15  21:53:01
 */
@Service
public interface StudentService {

    //添加学生对象
    int insertStudent(Student student);
}
