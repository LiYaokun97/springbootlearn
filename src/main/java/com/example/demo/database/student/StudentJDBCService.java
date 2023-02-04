package com.example.demo.database.student;

import com.example.demo.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service   //服务层依赖注入注解
public class StudentJDBCService  implements  StudentInterface {

    @Autowired
    private StudentJDBC studentJDBC;

    @Override
    public Student getStudent(Long id) {
        return studentJDBC.findById(id);
    }



    @Transactional
    @Override
    public void saveStudent(Student student) {
        studentJDBC.save(student);
        //int a = 2/0；  //人为制造一个异常，用于测试事务
    }

    @Override
    public void deleteStudent(Long id) {
        studentJDBC.deleteById(id);
    }

    @Override
    public void updateStudent(Student article) {
        studentJDBC.updateById(article);
    }


    @Override
    public List<Student> getAll() {
        return studentJDBC.findAll();
    }
}
